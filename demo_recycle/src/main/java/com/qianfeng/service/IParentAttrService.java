package com.qianfeng.service;


import com.qianfeng.vo.ParentAttrVo;

import java.util.List;

public interface IParentAttrService {

    List<ParentAttrVo> queryParentAttr1(Integer modelId);

    List<ParentAttrVo> queryParentAttr2(Integer modelId);

    List<ParentAttrVo> queryParentAttr3(Integer modelId);
}
