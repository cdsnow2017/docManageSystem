package edu.ynu.docmanagesystem.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import edu.ynu.docmanagesystem.poExtend.DocDetail;
import edu.ynu.docmanagesystem.poExtend.DocList;

public interface SectionService {

	/**
	 * description: 添加部门类别权限
	 * @param sectionId 部门id
	 * @param resourceTypeId 资源类别Id
	 * @param userAuthorityId 权限id
	 * @param isCascade 是否级联操作
	 */
	void addSectionReourceTypeAuthorization(Integer sectionId, Integer resourceTypeId, Integer userAuthorityId,
	        Boolean isCascade);

	/**
	 * description:删除部门类别权限
	 * @param sectionId 部门id
	 * @param resourceTypeId 资源类别Id
	 * @param userAuthorityId 权限id
	 * @param isCascade 是否级联操作 
	 */
	void deleteSectionReourceTypeAuthorization(Integer sectionId, Integer resourceTypeId, Integer userAuthorityId,
	        Boolean isCascade);

}
