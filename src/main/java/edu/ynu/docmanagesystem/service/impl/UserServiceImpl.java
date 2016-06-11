package edu.ynu.docmanagesystem.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ynu.docmanagesystem.mapper.RoleMenuMapper;
import edu.ynu.docmanagesystem.mapper.UserRoleMapper;
import edu.ynu.docmanagesystem.mapper.UserThisMapper;
import edu.ynu.docmanagesystem.mapperExtend.UserExtendMapper;
import edu.ynu.docmanagesystem.po.RoleMenu;
import edu.ynu.docmanagesystem.po.RoleMenuExample;
import edu.ynu.docmanagesystem.po.Section;
import edu.ynu.docmanagesystem.po.UserRole;
import edu.ynu.docmanagesystem.po.UserRoleExample;
import edu.ynu.docmanagesystem.po.UserThis;
import edu.ynu.docmanagesystem.poExtend.PermissionShiroString;
import edu.ynu.docmanagesystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserExtendMapper userExtendMapper;

	@Autowired
	private UserThisMapper userThisMapper;

	@Autowired
	private UserRoleMapper userRoleMapper;

	@Autowired
	private RoleMenuMapper roleMenuMapper;



	@Override
	public UserThis findUserById(Integer userId) {
		return userThisMapper.selectByPrimaryKey(userId);
	}

	@Override
	public String findMenuById(Integer userId) {
		List<Integer> findRoleById = findRoleById(userId);
		RoleMenuExample roleMenuExample = new RoleMenuExample();
		roleMenuExample.or().andRoleidIn(findRoleById);
		List<RoleMenu> selectByExample = roleMenuMapper.selectByExample(roleMenuExample);
		StringBuilder stringBuilder = new StringBuilder();
		for (RoleMenu roleMenu : selectByExample) {
			stringBuilder.append(roleMenu.getMenu());
		}
		return stringBuilder.toString();
	}

	@Override
	public List<Integer> findRoleById(Integer userId) {
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.or().andUseridEqualTo(userId);
		List<UserRole> selectByExample = userRoleMapper.selectByExample(userRoleExample);
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (UserRole userRole : selectByExample) {
			arrayList.add(userRole.getRoleid());

		}
		return arrayList;
	}

	@Override
	public List<String> findShiroPermissionById(Integer userId) {
		Section section = userExtendMapper.findSectionByUserId(userId);
		List<PermissionShiroString> shiroPermissionById = userExtendMapper
		        .findShiroPermissionById(section.getSectionid());
		return shiroPermissionById.stream().map(PermissionShiroString::toString).collect(Collectors.toList());

	}

}
