package edu.ynu.docmanagesystem.po;

public class ResourceWithBLOBs extends Resource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.contain
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    private byte[] contain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource.swf
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    private byte[] swf;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.contain
     *
     * @return the value of resource.contain
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public byte[] getContain() {
        return contain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.contain
     *
     * @param contain the value for resource.contain
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public void setContain(byte[] contain) {
        this.contain = contain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource.swf
     *
     * @return the value of resource.swf
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public byte[] getSwf() {
        return swf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource.swf
     *
     * @param swf the value for resource.swf
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    public void setSwf(byte[] swf) {
        this.swf = swf;
    }
}