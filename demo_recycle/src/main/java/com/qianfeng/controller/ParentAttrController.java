package com.qianfeng.controller;

import com.qianfeng.service.impl.ParentAttrServiceImpl;
import com.qianfeng.vo.ParentAttrVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/parentAttr")
public class ParentAttrController {

    @Autowired
    private ParentAttrServiceImpl parentAttrService;

    @RequestMapping(value = "/parent/{modelId}",method = RequestMethod.GET)
    public List<ParentAttrVo> queryParentAttr1(@PathVariable("modelId") Integer modelId){
        List<ParentAttrVo> parentAttrVos = parentAttrService.queryParentAttr1(modelId);
        return parentAttrVos;
    }

    @RequestMapping(value = "/attr/{modelId}",method = RequestMethod.GET)
    public List<ParentAttrVo> queryParentAttr2(@PathVariable("modelId") Integer modelId){
        List<ParentAttrVo> parentAttrVos = parentAttrService.queryParentAttr2(modelId);
        return parentAttrVos;
    }

    @RequestMapping(value = "/attrParent/{modelId}",method = RequestMethod.GET)
    public List<ParentAttrVo> queryParentAttr3(@PathVariable("modelId") Integer modelId){
        List<ParentAttrVo> parentAttrVos = parentAttrService.queryParentAttr3(modelId);
        return parentAttrVos;
    }
}
