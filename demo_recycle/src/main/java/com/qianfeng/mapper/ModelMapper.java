package com.qianfeng.mapper;

import com.qianfeng.po.PhoneModelInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ModelMapper {

    List<PhoneModelInfo> selectModelName();

    List<PhoneModelInfo> selectModelNameAndImg();

    List<PhoneModelInfo> selectModelByBrandId(@Param("brandId") Integer brandId);
}
