package com.example.exerciseSession3.business;

import com.example.exerciseSession3.data.entity.CustomerEntity;
import com.example.exerciseSession3.web.ItemDTO;
import com.taxjar.model.taxes.TaxResponse;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    TaxResponse getTaxRateBasedOnCustomerAddress(String customerName, List<ItemDTO> items);
}
