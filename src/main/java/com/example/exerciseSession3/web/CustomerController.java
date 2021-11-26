package com.example.exerciseSession3.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getCustomer() {
        return "customer";
    }
}
