package com.qianfeng.mapper;

import com.qianfeng.vo.ModelInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ModelInfoMapper {

    ModelInfoVo selectModelInfoById(@Param("modelId") Integer modelId);
}
