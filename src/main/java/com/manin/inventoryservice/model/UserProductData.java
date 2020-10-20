package com.manin.inventoryservice.model;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

@ApiModel(description = "Describes product specific data of a user's inventory")
public class UserProductData {
    private BigDecimal mrp;
    private BigDecimal costPrice;
    private Integer quantity;
    private BigDecimal discount;

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
