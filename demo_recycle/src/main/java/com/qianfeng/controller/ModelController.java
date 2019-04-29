package com.qianfeng.controller;

import com.qianfeng.po.PhoneModelInfo;
import com.qianfeng.service.impl.ModelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelServiceImpl modelService;

    @ResponseBody
    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public List<PhoneModelInfo> select(@PathVariable("page") Integer page){
        List<PhoneModelInfo> models = modelService.queryModelName();
        return models;
    }

    @ResponseBody
    @RequestMapping(value = "/nameAndImg",method = RequestMethod.GET)
    public List<PhoneModelInfo> queryModelNameAndImg(){
        List<PhoneModelInfo> models = modelService.selectModelNameAndImg();
        return models;
    }

    //根据品牌id查询所有手机
    @ResponseBody
    @RequestMapping(value = "/modelByBrandId/{brandId}",method = RequestMethod.GET)
    public List<PhoneModelInfo> queryModelByBrandId(@PathVariable("brandId") Integer brandId){
        List<PhoneModelInfo> models = modelService.queryModelByBrandId(brandId);
        return models;
     }

}
