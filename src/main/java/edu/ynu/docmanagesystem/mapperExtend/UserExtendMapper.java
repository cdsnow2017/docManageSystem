package edu.ynu.docmanagesystem.mapperExtend;

public interface UserExtendMapper {
	
	int verifyUser(Integer userId, String password, Integer roleId);

}
