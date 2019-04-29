package com.qianfeng.service.impl;

import com.qianfeng.commons.Constants;
import com.qianfeng.mapper.ParentAttrMapper;
import com.qianfeng.service.IParentAttrService;
import com.qianfeng.vo.ParentAttrVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentAttrServiceImpl implements IParentAttrService {

    @Autowired
    private ParentAttrMapper parentAttrMapper;

    @Override
    public List<ParentAttrVo> queryParentAttr1(Integer modelId) {
        List<ParentAttrVo> parentAttrVos =
                parentAttrMapper.selectParentAttr(modelId,Constants.FISRT_PART_BEGIN,Constants.FISRT_PART_END);
        if(null != parentAttrVos){
            return parentAttrVos;
        }
        return null;
    }

    @Override
    public List<ParentAttrVo> queryParentAttr2(Integer modelId) {
        List<ParentAttrVo> parentAttrVos =
                parentAttrMapper.selectParentAttr(modelId,Constants.SECOND_PART_BEGIN,Constants.SECOND_PART_END);
        if(null != parentAttrVos){
            return parentAttrVos;
        }
        return null;
    }

    @Override
    public List<ParentAttrVo> queryParentAttr3(Integer modelId) {
        List<ParentAttrVo> parentAttrVos =
                parentAttrMapper.selectParentAttr(modelId,Constants.THIRD_PART_BEGIN,Constants.THIRD_PART_END);
        if(null != parentAttrVos){
            return parentAttrVos;
        }
        return null;
    }
}
