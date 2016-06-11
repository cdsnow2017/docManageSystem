package edu.ynu.docmanagesystem.security;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ynu.docmanagesystem.po.UserThis;
import edu.ynu.docmanagesystem.service.UserService;

public class CustomRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		Integer userId = (Integer) arg0.getPrimaryPrincipal();
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		List<Integer> findRoleById = userService.findRoleById(userId);
		List<String> roles = findRoleById.stream().map(String::valueOf).collect(Collectors.toList());
		simpleAuthorizationInfo.addRoles(roles);
		simpleAuthorizationInfo.addStringPermissions(userService.findShiroPermissionById(userId));
		return simpleAuthorizationInfo;

	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {

		// 第一步从token中取出用户名
		String userId = (String) arg0.getPrincipal();
		UserThis user = userService.findUserById(Integer.valueOf(userId));
		if (user == null) {
			return null;
		}

		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUserid(),
		        user.getPassword(), ByteSource.Util.bytes(user.getSalt()), this.getName());
		return simpleAuthenticationInfo;

	}

}
