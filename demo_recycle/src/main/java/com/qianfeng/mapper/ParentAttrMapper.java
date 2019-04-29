package com.qianfeng.mapper;

import com.qianfeng.vo.ParentAttrVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ParentAttrMapper {

    List<ParentAttrVo> selectParentAttr(@Param("modelId") Integer modelId,
                                       @Param("beginRow") Integer beginRow,
                                       @Param("endRow") Integer endRow);
}
