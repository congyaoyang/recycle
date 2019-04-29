package com.qianfeng.service.impl;

import com.qianfeng.mapper.ImgAndPriceMapper;
import com.qianfeng.service.IImgAndPriceService;
import com.qianfeng.vo.ImgAndPriceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgAndPriceServiceImpl implements IImgAndPriceService {

    @Autowired
    private ImgAndPriceMapper imgAndPriceMapper;

    @Override
    public List<ImgAndPriceVo> queryImgAndPrice(Integer modelId,String[] array) {
        List<ImgAndPriceVo> imgAndPriceVos = imgAndPriceMapper.selectImgAndPrice(modelId,array);
        if(null != imgAndPriceVos){
            return imgAndPriceVos;
        }
        return null;
    }
}
