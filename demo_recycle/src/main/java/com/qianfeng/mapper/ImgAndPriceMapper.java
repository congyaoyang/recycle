package com.qianfeng.mapper;

import com.qianfeng.vo.ImgAndPriceVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ImgAndPriceMapper {

    List<ImgAndPriceVo> selectImgAndPrice(@Param("modelId") Integer modelId,@Param("array") String[] strs);
}
