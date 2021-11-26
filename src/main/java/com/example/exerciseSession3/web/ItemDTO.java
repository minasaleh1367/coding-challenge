package com.example.exerciseSession3.web;

public class ItemDTO {

    public ItemDTO(String itemId, Integer quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    private String itemId;

    private Integer quantity;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
