package edu.ynu.docmanagesystem.mapperExtend;

import java.util.List;

import edu.ynu.docmanagesystem.po.Section;
import edu.ynu.docmanagesystem.poExtend.PermissionShiroString;

public interface UserExtendMapper {

	List<PermissionShiroString> findShiroPermissionById(Integer sectionId);

	Section findSectionByUserId(Integer userId);

}
