package com.qianfeng.po;


public class PhoneModelInfo {

  private long modelId;
  private String modelName;
  private String modelImage;
  private long modelPrice;
  private long brandId;

  public long getModelId() {
    return modelId;
  }

  public void setModelId(long modelId) {
    this.modelId = modelId;
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

  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }

  @Override
  public String toString() {
    return "PhoneModelInfo{" +
            "modelId=" + modelId +
            ", modelName='" + modelName + '\'' +
            ", modelImage='" + modelImage + '\'' +
            ", modelPrice=" + modelPrice +
            ", brandId=" + brandId +
            '}';
  }
}
