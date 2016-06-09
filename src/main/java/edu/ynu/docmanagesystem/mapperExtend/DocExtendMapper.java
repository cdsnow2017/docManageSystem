package edu.ynu.docmanagesystem.mapperExtend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.ynu.docmanagesystem.poExtend.DocList;

public interface DocExtendMapper {

	List<DocList> findAllresouceList(@Param("sectionId")Integer sectionId, @Param("resouceType")Integer resouceType);

}
