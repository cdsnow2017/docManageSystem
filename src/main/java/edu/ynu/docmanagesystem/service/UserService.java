package edu.ynu.docmanagesystem.service;

import edu.ynu.docmanagesystem.po.UserThis;

/**
 * description:
 * @author cdsnow2017@163.com
 * @since 2016年5月22日 下午12:38:52
 * @version 1.0
 */
public interface UserService {

	/**
	 * description:登录验证
	 * @param userId 用户id
	 * @param password 密码
	 * @param roleId 选择的登录角色id
	 * @return -1：用户不存在  1：登录成功  0：用户无此角色权限 -2：密码错误
	 */
	int loginVerify(Integer userId,String  password, Integer roleId); 
	
	/**
	 * description: 验证用户是否具有对请求的用户功能的权限
	 * @param userId 用户id
	 * @param resourceId 资源id
	 * @param userAuthorityId 所请求的功能id
	 * @return 0：不具有 1：具有 
	 */
	int userAuthenticate(Integer userId,Integer resourceId,Integer userAuthorityId);
	
	UserThis findUserById(Integer userId);
	
	
}
