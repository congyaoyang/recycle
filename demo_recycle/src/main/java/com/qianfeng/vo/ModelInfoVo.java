package com.qianfeng.vo;


public class ModelInfoVo {

    private String brandName;
    private String modelName;
    private String modelImage;
    private long modelPrice;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelImage() {
        return modelImage;
    }

    public void setModelImage(String modelImage) {
        this.modelImage = modelImage;
    }

    public long getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(long modelPrice) {
        this.modelPrice = modelPrice;
    }

    @Override
    public String toString() {
        return "ModelInfoVo{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelImage='" + modelImage + '\'' +
                ", modelPrice=" + modelPrice +
                '}';
    }
}
