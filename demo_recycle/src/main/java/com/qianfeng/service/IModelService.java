package com.qianfeng.service;

import com.qianfeng.po.PhoneModelInfo;

import java.util.List;

public interface IModelService {

    List<PhoneModelInfo> queryModelName();

    List<PhoneModelInfo> selectModelNameAndImg();

    List<PhoneModelInfo> queryModelByBrandId(Integer brandId);
}
