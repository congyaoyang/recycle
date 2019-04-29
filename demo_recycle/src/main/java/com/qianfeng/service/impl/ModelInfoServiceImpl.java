package com.qianfeng.service.impl;

import com.qianfeng.mapper.ModelInfoMapper;
import com.qianfeng.service.IModelInfoService;
import com.qianfeng.vo.ModelInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelInfoServiceImpl implements IModelInfoService {

    @Autowired
    private ModelInfoMapper modelInfoMapper;

    @Override
    public ModelInfoVo queryModelInfoById(Integer modelId) {
        ModelInfoVo modelInfoVo = modelInfoMapper.selectModelInfoById(modelId);
        if(null != modelInfoVo){
            return modelInfoVo;
        }
        return null;
    }
}
