package edu.ynu.docmanagesystem.po;

public class Section {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column section.sectionId
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    private Integer sectionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column section.sectionCascadeId
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    private String sectioncascadeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column section.sectionDescribe
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    private String sectiondescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column section.sectionId
     *
     * @return the value of section.sectionId
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public Integer getSectionid() {
        return sectionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column section.sectionId
     *
     * @param sectionid the value for section.sectionId
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column section.sectionCascadeId
     *
     * @return the value of section.sectionCascadeId
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public String getSectioncascadeid() {
        return sectioncascadeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column section.sectionCascadeId
     *
     * @param sectioncascadeid the value for section.sectionCascadeId
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void setSectioncascadeid(String sectioncascadeid) {
        this.sectioncascadeid = sectioncascadeid == null ? null : sectioncascadeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column section.sectionDescribe
     *
     * @return the value of section.sectionDescribe
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public String getSectiondescribe() {
        return sectiondescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column section.sectionDescribe
     *
     * @param sectiondescribe the value for section.sectionDescribe
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void setSectiondescribe(String sectiondescribe) {
        this.sectiondescribe = sectiondescribe == null ? null : sectiondescribe.trim();
    }
}