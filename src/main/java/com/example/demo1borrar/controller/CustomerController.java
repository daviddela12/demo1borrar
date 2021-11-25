package com.example.demo1borrar.controller;

import com.example.demo1borrar.domain.Customer;
import com.example.demo1borrar.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("{id}")
    public Customer getCustomerById(@PathVariable("id") Long id) {
        return customerService.getById(id);
    }
}
