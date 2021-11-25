package com.example.demo1borrar.service.impl;

import com.example.demo1borrar.domain.Customer;
import com.example.demo1borrar.repository.CustomerRepository;
import com.example.demo1borrar.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer getById( Long id ) {
        return customerRepository.getById(id);
    }
}
