package edu.ynu.docmanagesystem.po.Rms;

public class systemauthority {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Rms.systemAuthority.systemAuthirityId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    private Integer systemauthirityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Rms.systemAuthority.systemAuthorityDescribe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    private String systemauthoritydescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Rms.systemAuthority.systemAuthirityId
     *
     * @return the value of Rms.systemAuthority.systemAuthirityId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public Integer getSystemauthirityid() {
        return systemauthirityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Rms.systemAuthority.systemAuthirityId
     *
     * @param systemauthirityid the value for Rms.systemAuthority.systemAuthirityId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public void setSystemauthirityid(Integer systemauthirityid) {
        this.systemauthirityid = systemauthirityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Rms.systemAuthority.systemAuthorityDescribe
     *
     * @return the value of Rms.systemAuthority.systemAuthorityDescribe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public String getSystemauthoritydescribe() {
        return systemauthoritydescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Rms.systemAuthority.systemAuthorityDescribe
     *
     * @param systemauthoritydescribe the value for Rms.systemAuthority.systemAuthorityDescribe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public void setSystemauthoritydescribe(String systemauthoritydescribe) {
        this.systemauthoritydescribe = systemauthoritydescribe == null ? null : systemauthoritydescribe.trim();
    }
}