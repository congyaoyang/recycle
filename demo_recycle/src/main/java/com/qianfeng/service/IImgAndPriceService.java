package com.qianfeng.service;

import com.qianfeng.vo.ImgAndPriceVo;

import java.util.List;

public interface IImgAndPriceService {

    List<ImgAndPriceVo> queryImgAndPrice(Integer modelId,String[] array);
}
