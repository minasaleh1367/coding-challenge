package com.example.exerciseSession3.business.service;

import com.example.exerciseSession3.business.CustomerService;
import com.example.exerciseSession3.data.entity.CustomerEntity;
import com.example.exerciseSession3.data.entity.ItemEntity;
import com.example.exerciseSession3.data.repository.CustomerRepository;
import com.example.exerciseSession3.data.repository.ItemRepository;
import com.example.exerciseSession3.web.ItemDTO;
import com.taxjar.Taxjar;
import com.taxjar.exception.TaxjarException;
import com.taxjar.model.taxes.TaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("staffService")
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, ItemRepository itemRepository) {
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
    }

    public TaxResponse getTaxRateBasedOnCustomerAddress(String customerId, List<ItemDTO> items) {

        Taxjar client = new Taxjar("67e75420d641a98c2026e85962f6b2df");

        try {
            Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
            CustomerEntity existedCustomerEntity = new CustomerEntity();
            if (customerEntity.isPresent())
                existedCustomerEntity = customerEntity.get();
            else return null;
            Map<String, Object> params = new HashMap<>();
            params.put("customer_id", existedCustomerEntity.getCustomerId());


            List<Map> itemEntities = new ArrayList();
            Map<String, Object> mapItems = new HashMap<>();
            for (ItemDTO itemDTO : items) {
                Optional<ItemEntity> itemEntity = itemRepository.findById(itemDTO.getItemId());
                mapItems.put("id", itemDTO.getItemId());
                mapItems.put("quantity", itemDTO.getQuantity());
                mapItems.put("unit_price", itemEntity.get().getItemPrice());
                itemEntities.add(mapItems);
            }
            params.put("line_items", itemEntities);

            TaxResponse res = client.taxForOrder(params);
            return res;

        } catch (TaxjarException e) {
            e.printStackTrace();
            return null;
        }
    }
}
