package edu.ynu.docmanagesystem.po;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.userId
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.roleId
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    private Integer roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.userId
     *
     * @return the value of user_role.userId
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.userId
     *
     * @param userid the value for user_role.userId
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.roleId
     *
     * @return the value of user_role.roleId
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.roleId
     *
     * @param roleid the value for user_role.roleId
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}