package com.example.exerciseSession3.business.service.impl;

import com.example.exerciseSession3.business.CustomerService;
import com.example.exerciseSession3.web.ItemDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    void test() {
        List<ItemDTO> itemDTOList = new ArrayList<>();
        ItemDTO itemDTO1 = new ItemDTO("1",1);
        ItemDTO itemDTO2 = new ItemDTO("2",2);
        ItemDTO itemDTO3 = new ItemDTO("3",3);
        ItemDTO itemDTO4 = new ItemDTO("4",4);

        itemDTOList.add(itemDTO1);
        itemDTOList.add(itemDTO2);
        itemDTOList.add(itemDTO3);
        itemDTOList.add(itemDTO4);

        customerService.getTaxRateBasedOnCustomerAddress("Microsoft",itemDTOList );

    }
}
