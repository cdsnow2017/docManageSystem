package edu.ynu.docmanagesystem.po;

public class Resourcetype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourceType.resourceTypeId
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    private Integer resourcetypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourceType.resourceTypeDescribe
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    private String resourcetypedescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourceType.resourceManagerId
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    private Integer resourcemanagerid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourceType.resourceTypeId
     *
     * @return the value of resourceType.resourceTypeId
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    public Integer getResourcetypeid() {
        return resourcetypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourceType.resourceTypeId
     *
     * @param resourcetypeid the value for resourceType.resourceTypeId
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    public void setResourcetypeid(Integer resourcetypeid) {
        this.resourcetypeid = resourcetypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourceType.resourceTypeDescribe
     *
     * @return the value of resourceType.resourceTypeDescribe
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    public String getResourcetypedescribe() {
        return resourcetypedescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourceType.resourceTypeDescribe
     *
     * @param resourcetypedescribe the value for resourceType.resourceTypeDescribe
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    public void setResourcetypedescribe(String resourcetypedescribe) {
        this.resourcetypedescribe = resourcetypedescribe == null ? null : resourcetypedescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourceType.resourceManagerId
     *
     * @return the value of resourceType.resourceManagerId
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    public Integer getResourcemanagerid() {
        return resourcemanagerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourceType.resourceManagerId
     *
     * @param resourcemanagerid the value for resourceType.resourceManagerId
     *
     * @mbggenerated Sun Jun 12 17:01:25 CST 2016
     */
    public void setResourcemanagerid(Integer resourcemanagerid) {
        this.resourcemanagerid = resourcemanagerid;
    }
}