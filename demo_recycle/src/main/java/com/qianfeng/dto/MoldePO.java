package com.qianfeng.dto;

public class MoldePO {

    private String remove_url;
    private Integer rowid;
    private String base_url;
    private String img;
    private String name;
    private Integer price;

    public String getRemove_url() {
        return remove_url;
    }

    public void setRemove_url(String remove_url) {
        this.remove_url = remove_url;
    }

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MoldePO{" +
                "remove_url='" + remove_url + '\'' +
                ", rowid=" + rowid +
                ", base_url='" + base_url + '\'' +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
