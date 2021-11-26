package com.example.exerciseSession3.data.entity;

import com.google.gson.annotations.SerializedName;
import org.springframework.boot.system.SystemProperties;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {
    @Id
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
}
