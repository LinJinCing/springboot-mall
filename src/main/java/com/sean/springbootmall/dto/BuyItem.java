package com.sean.springbootmall.dto;

import jakarta.validation.constraints.NotNull;

public class BuyItem {

    @NotNull
    private int productId;

    @NotNull
    private int quantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
