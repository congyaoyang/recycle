package com.qianfeng.dto;

public class CartDTO {

    private Integer cart_total_items;
    private Integer cart_total;

    public Integer getCart_total_items() {
        return cart_total_items;
    }

    public void setCart_total_items(Integer cart_total_items) {
        this.cart_total_items = cart_total_items;
    }

    public Integer getCart_total() {
        return cart_total;
    }

    public void setCart_total(Integer cart_total) {
        this.cart_total = cart_total;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "cart_total_items=" + cart_total_items +
                ", cart_total=" + cart_total +
                '}';
    }
}
