package com.qianfeng.controller;

import com.qianfeng.service.impl.ImgAndPriceServiceImpl;
import com.qianfeng.vo.ImgAndPriceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/imgAndPrice")
public class ImgAndPriceController {

    @Autowired
    private ImgAndPriceServiceImpl imgAndPriceService;

    @RequestMapping(value = "/price/{moldeId}/{idArray}",method = RequestMethod.POST)
    @ResponseBody
    public List<String> queryImgAndPrice(@PathVariable("moldeId")Integer moldeId,@PathVariable("idArray") String[] idArray){
        List<ImgAndPriceVo> imgAndPriceVos = imgAndPriceService.queryImgAndPrice(moldeId,idArray);
        int sum = 0;
        for(ImgAndPriceVo imgAndPriceVo : imgAndPriceVos){
            sum += imgAndPriceVo.getDiscountPrice();
        }
        sum = imgAndPriceVos.get(0).getModelPrice()+sum;
        ArrayList<String> strs = new ArrayList<>();
        strs.add(String.valueOf(sum));
        strs.add(imgAndPriceVos.get(0).getModelImage());
        return strs;
    }
}
