package com.manin.inventoryservice.service;

import com.manin.inventoryservice.model.Inventory;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public Inventory getAllInventory() {
        return new Inventory();
    }

    public Inventory getInventoryById(String inventoryId) {
        return new Inventory();
    }

    public Inventory saveInventory(Inventory inventory) {
        return new Inventory();
    }
}
