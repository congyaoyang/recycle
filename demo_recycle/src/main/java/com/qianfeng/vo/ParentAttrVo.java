package com.qianfeng.vo;

import java.util.List;

public class ParentAttrVo {

    private Integer attrId;
    private String attrName;
    private List<ChildAttrVo> childAttrVos;

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public List<ChildAttrVo> getChildAttrVos() {
        return childAttrVos;
    }

    public void setChildAttrVos(List<ChildAttrVo> childAttrVos) {
        this.childAttrVos = childAttrVos;
    }

    @Override
    public String toString() {
        return "ParentAttrVo{" +
                "attrId=" + attrId +
                ", attrName='" + attrName + '\'' +
                ", childAttrVos=" + childAttrVos +
                '}';
    }
}
