package edu.ynu.docmanagesystem.poExtend;

public class PermissionShiroString {

	private Integer resourceType;

	private Integer userAuthorityId;

	public Integer getResourceType() {
		return resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	public Integer getUserAuthorityId() {
		return userAuthorityId;
	}

	public void setUserAuthorityId(Integer userAuthorityId) {
		this.userAuthorityId = userAuthorityId;
	}

	@Override
	public String toString() {
		return resourceType + ":" + userAuthorityId;
	}

}
