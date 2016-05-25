package edu.ynu.docmanagesystem.mapper.Rms;

import edu.ynu.docmanagesystem.po.Rms.resource;
import edu.ynu.docmanagesystem.po.Rms.resourceExample;
import edu.ynu.docmanagesystem.po.Rms.resourceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface resourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int countByExample(resourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int deleteByExample(resourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int insert(resourceWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int insertSelective(resourceWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    List<resourceWithBLOBs> selectByExampleWithBLOBs(resourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    List<resource> selectByExample(resourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") resourceWithBLOBs record, @Param("example") resourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") resourceWithBLOBs record, @Param("example") resourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.resource
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int updateByExample(@Param("record") resource record, @Param("example") resourceExample example);
}