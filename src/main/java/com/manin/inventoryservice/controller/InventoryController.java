package com.manin.inventoryservice.controller;

import com.manin.inventoryservice.model.Inventory;
import com.manin.inventoryservice.service.InventoryService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class InventoryController {
    public static final String INVENTORY_URL = "/inventory";
    public static final String INVENTORY_URL_ID = "/inventory/{id}";

    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @ApiOperation("Get all Inventory")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Retrieves inventory", response = Inventory.class)
    })
    @GetMapping(path = INVENTORY_URL, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Inventory getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @ApiOperation("Get Inventory by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Retrieves inventory by Id", response = Inventory.class)
    })
    @GetMapping(path = INVENTORY_URL_ID, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Inventory getInventoryById(@PathVariable String id) {
        return inventoryService.getInventoryById(id);
    }

    @ApiOperation("Saves Inventory to db")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Inventory saved to db", response = Inventory.class)
    })
    @PostMapping(path = INVENTORY_URL, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Inventory saveInventory(Inventory inventory) {
        return inventoryService.saveInventory(inventory);
    }

}
