package com.qianfeng.vo;

public class ImgAndPriceVo {

    private Integer discountPrice;
    private String modelImage;
    private Integer modelPrice;

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getModelImage() {
        return modelImage;
    }

    public void setModelImage(String modelImage) {
        this.modelImage = modelImage;
    }

    public Integer getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(Integer modelPrice) {
        this.modelPrice = modelPrice;
    }

    @Override
    public String toString() {
        return "ImgAndPrice{" +
                "discountPrice=" + discountPrice +
                ", modelImage='" + modelImage + '\'' +
                ", modelPrice=" + modelPrice +
                '}';
    }
}
