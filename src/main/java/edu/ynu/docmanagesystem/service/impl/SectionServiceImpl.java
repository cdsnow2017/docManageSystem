package edu.ynu.docmanagesystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ynu.docmanagesystem.mapper.SectionMapper;
import edu.ynu.docmanagesystem.mapper.SectionUserauthorityResourcetypeMapper;
import edu.ynu.docmanagesystem.mapperExtend.SectionExtendMapper;
import edu.ynu.docmanagesystem.po.Section;
import edu.ynu.docmanagesystem.po.SectionUserauthorityResourcetype;
import edu.ynu.docmanagesystem.po.SectionUserauthorityResourcetypeKey;
import edu.ynu.docmanagesystem.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService {

	@Autowired
	private SectionExtendMapper sectionExtendMapper;

	@Autowired
	private SectionMapper sectionMapper;

	@Autowired
	private SectionUserauthorityResourcetypeMapper sectionUserauthorityResourcetypeMapper;

	@Override
	public void addSectionReourceTypeAuthorization(Integer sectionId, Integer resourceTypeId, Integer userAuthorityId,
	        Boolean isCascade) {
		Section selectByPrimaryKey = sectionMapper.selectByPrimaryKey(sectionId);
		SectionUserauthorityResourcetype sectionUserauthorityResourcetype = new SectionUserauthorityResourcetype();
		sectionUserauthorityResourcetype.setResourcetypeid(resourceTypeId);
		sectionUserauthorityResourcetype.setSectionid(sectionId);
		sectionUserauthorityResourcetype.setSectioncascadeid(selectByPrimaryKey.getSectioncascadeid());
		sectionUserauthorityResourcetype.setUserauthorityid(userAuthorityId);
		sectionUserauthorityResourcetypeMapper.insert(sectionUserauthorityResourcetype);
		if (isCascade) {
			List<Section> subSections = sectionExtendMapper.findAllSubSectionsById(sectionId);
			for (Section section : subSections) {
				sectionUserauthorityResourcetype.setSectionid(section.getSectionid());
				sectionUserauthorityResourcetype.setSectioncascadeid(section.getSectioncascadeid());
				try {
					sectionUserauthorityResourcetypeMapper.insert(sectionUserauthorityResourcetype);
				} catch (Exception e) {

				}
			}
		}

	}

	@Override
	public void deleteSectionReourceTypeAuthorization(Integer sectionId, Integer resourceTypeId,
	        Integer userAuthorityId, Boolean isCascade) {
		SectionUserauthorityResourcetypeKey key = new SectionUserauthorityResourcetypeKey();
		key.setResourcetypeid(resourceTypeId);
		key.setSectionid(sectionId);
		key.setUserauthorityid(userAuthorityId);
		sectionUserauthorityResourcetypeMapper.deleteByPrimaryKey(key);
		if (isCascade) {
			List<Section> subSections = sectionExtendMapper.findAllSubSectionsById(sectionId);
			for (Section section : subSections) {
				key.setSectionid(section.getSectionid());
				sectionUserauthorityResourcetypeMapper.deleteByPrimaryKey(key);
			}
		}
	}

}
