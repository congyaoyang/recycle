package com.qianfeng.vo;

public class ChildAttrVo {

    private Integer childId;
    private String childName;
    private String childInfo;
    private Integer attrPrice;

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildInfo() {
        return childInfo;
    }

    public void setChildInfo(String childInfo) {
        this.childInfo = childInfo;
    }

    public Integer getAttrPrice() {
        return attrPrice;
    }

    public void setAttrPrice(Integer attrPrice) {
        this.attrPrice = attrPrice;
    }

    @Override
    public String toString() {
        return "ChildAttrVo{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                ", childInfo='" + childInfo + '\'' +
                ", attrPrice=" + attrPrice +
                '}';
    }
}
