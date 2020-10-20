package com.manin.inventoryservice.model;

import io.swagger.annotations.ApiModel;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@ApiModel(description = "Describes user inventory")
public class Inventory {
    @Id
    private String id;
    private String userId;
    private String productId;
    private String sku;
    private LocalDateTime inventoryDate;
    private UserProductData userProductData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public UserProductData getUserProductData() {
        return userProductData;
    }

    public void setUserProductData(UserProductData userProductData) {
        this.userProductData = userProductData;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public LocalDateTime getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(LocalDateTime inventoryDate) {
        this.inventoryDate = inventoryDate;
    }
}
