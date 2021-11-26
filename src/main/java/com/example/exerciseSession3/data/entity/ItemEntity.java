package com.example.exerciseSession3.data.entity;

import org.springframework.boot.system.SystemProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class ItemEntity {
    @Id
    @Column(name = "ITEM_ID")
    private String itemId;

    @Column(name = "ITEM_PRICE")
    private Double itemPrice;

    public String getItemId() {
        return itemId;
    }

    public Double getItemPrice() {
        return itemPrice;
    }
}
