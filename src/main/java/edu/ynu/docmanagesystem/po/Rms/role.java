package edu.ynu.docmanagesystem.po.Rms;

public class role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Rms.role.roleId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    private Integer roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Rms.role.describe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    private String describe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Rms.role.roleId
     *
     * @return the value of Rms.role.roleId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Rms.role.roleId
     *
     * @param roleid the value for Rms.role.roleId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Rms.role.describe
     *
     * @return the value of Rms.role.describe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Rms.role.describe
     *
     * @param describe the value for Rms.role.describe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}