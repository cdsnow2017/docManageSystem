package edu.ynu.docmanagesystem.service;

import java.util.List;

import edu.ynu.docmanagesystem.po.UserThis;

/**
 * description:
 * @author cdsnow2017@163.com
 * @since 2016年5月22日 下午12:38:52
 * @version 1.0
 */
public interface UserService {

	UserThis findUserById(Integer userId);

	/**
	 * description: 查找某人的菜单项
	 * @param userId
	 * @return 菜单项拼接的字符串
	 */
	String findMenuById(Integer userId);

	/**
	 * description:查找某人所拥有的角色
	 * @param userId
	 * @return 
	 */
	List<Integer> findRoleById(Integer userId);

	/**
	 * description:查找某人的所有授权，返回字符串格式为shiro格式
	 * @param userId
	 * @return 
	 */
	List<String> findShiroPermissionById(Integer userId);

}
