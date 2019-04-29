package com.qianfeng.controller;


import com.qianfeng.service.impl.ModelInfoServiceImpl;
import com.qianfeng.vo.ModelInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/modelInfo")
public class ModelInfoVoController {

    @Autowired
    private ModelInfoServiceImpl modelInfoService;

    @RequestMapping(value = "/{modelId}",method = RequestMethod.GET)
    public ModelInfoVo queryModelInfoById(@PathVariable("modelId") Integer modelId){
        ModelInfoVo modelInfoVo = modelInfoService.queryModelInfoById(modelId);
        return modelInfoVo;
    }
}
