package com.qianfeng.service.impl;

import com.qianfeng.mapper.BrandMapper;
import com.qianfeng.po.PhoneBrandInfo;
import com.qianfeng.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<PhoneBrandInfo> queryBrandName() {
        List<PhoneBrandInfo> brands = brandMapper.selectBrandName();
        if(null != brands && brands.size() != 0){
            return brands;
        }
        return null;
    }
}
