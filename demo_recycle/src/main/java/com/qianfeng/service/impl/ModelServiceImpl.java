package com.qianfeng.service.impl;

import com.qianfeng.mapper.ModelMapper;
import com.qianfeng.po.PhoneModelInfo;
import com.qianfeng.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements IModelService {

    @Autowired
    private ModelMapper modelMapper;

    //查询手机型号名称
    @Override
    public List<PhoneModelInfo> queryModelName() {
        List<PhoneModelInfo> models = modelMapper.selectModelName();
        if(models != null && models.size() != 0){
            return models;
        }
        return null;
    }

    //同时查询手机型号名称和图片url
    @Override
    public List<PhoneModelInfo> selectModelNameAndImg() {
        List<PhoneModelInfo> models = modelMapper.selectModelNameAndImg();
        if(models != null && models.size() != 0){
            return models;
        }
        return null;
    }

    //根据品牌id查询所有手机
    @Override
    public List<PhoneModelInfo> queryModelByBrandId(Integer brandId) {
        List<PhoneModelInfo> models = modelMapper.selectModelByBrandId(brandId);
        if(models != null && models.size() != 0){
            return models;
        }
        return null;
    }

}
