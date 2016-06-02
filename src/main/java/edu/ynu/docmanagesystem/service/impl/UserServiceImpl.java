package edu.ynu.docmanagesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ynu.docmanagesystem.mapper.UserThisMapper;
import edu.ynu.docmanagesystem.mapperExtend.UserExtendMapper;
import edu.ynu.docmanagesystem.po.UserThis;
import edu.ynu.docmanagesystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserExtendMapper userExtendMapper;

	@Autowired
	private  UserThisMapper userThisMapper;

	@Override
	public int userAuthenticate(Integer userId, Integer resourceId, Integer userAuthorityId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int loginVerify(Integer userId, String password, Integer roleId) {
		return userExtendMapper.verifyUser(userId, password, roleId);
	}

	@Override
	public UserThis findUserById(Integer userId) {
		return userThisMapper.selectByPrimaryKey(userId);
	}

}
