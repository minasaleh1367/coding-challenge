package com.example.exerciseSession3.web;


import com.example.exerciseSession3.business.CustomerService;
import com.taxjar.model.taxes.TaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerRestController {

    private final CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    @RequestMapping(value = "/customer/calculate", method = RequestMethod.GET, produces = "application/json")
    public TaxResponse calculate(@RequestParam(value = "customerId") String customerId,
                                 @RequestParam(value = "ItemQuantity1") Integer itemQuantity1,
                                 @RequestParam(value = "ItemQuantity2") Integer itemQuantity2,
                                 @RequestParam(value = "ItemQuantity3") Integer itemQuantity3,
                                 @RequestParam(value = "ItemQuantity4") Integer itemQuantity4) {
        List<ItemDTO> itemDTOs = new ArrayList<>();
        ItemDTO itemDTO1 = new ItemDTO("1",itemQuantity1);
        itemDTOs.add(itemDTO1);
        ItemDTO itemDTO2 = new ItemDTO("2",itemQuantity2);
        itemDTOs.add(itemDTO2);
        ItemDTO itemDTO3 = new ItemDTO("3",itemQuantity3);
        itemDTOs.add(itemDTO3);
        ItemDTO itemDTO4 = new ItemDTO("4",itemQuantity4);
        itemDTOs.add(itemDTO4);

        TaxResponse taxResponse =
                this.customerService.getTaxRateBasedOnCustomerAddress(customerId, itemDTOs);
        return taxResponse;
    }


}