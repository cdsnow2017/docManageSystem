package edu.ynu.docmanagesystem.mapper;

import edu.ynu.docmanagesystem.po.Systemauthority;
import edu.ynu.docmanagesystem.po.SystemauthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemauthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    int countByExample(SystemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    int deleteByExample(SystemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    int insert(Systemauthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    int insertSelective(Systemauthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    List<Systemauthority> selectByExample(SystemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") Systemauthority record, @Param("example") SystemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemAuthority
     *
     * @mbggenerated Sat Jun 04 17:24:33 CST 2016
     */
    int updateByExample(@Param("record") Systemauthority record, @Param("example") SystemauthorityExample example);
}