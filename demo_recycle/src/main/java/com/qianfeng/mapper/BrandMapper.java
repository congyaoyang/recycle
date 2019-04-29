package com.qianfeng.mapper;

import com.qianfeng.po.PhoneBrandInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    List<PhoneBrandInfo> selectBrandName();
}
