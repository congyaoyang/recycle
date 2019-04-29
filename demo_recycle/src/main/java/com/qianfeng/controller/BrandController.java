package com.qianfeng.controller;

import com.qianfeng.po.PhoneBrandInfo;
import com.qianfeng.po.PhoneModelInfo;
import com.qianfeng.service.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandServiceImpl brandService;

    @ResponseBody
    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public List<PhoneBrandInfo> select(@PathVariable("page") Integer page){
        List<PhoneBrandInfo> brands = brandService.queryBrandName();
        return brands;
    }


}
