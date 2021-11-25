package com.example.demo1borrar.service.impl;

import com.example.demo1borrar.domain.Customer;
import com.example.demo1borrar.exception.ResourceNotFoundException;
import com.example.demo1borrar.repository.CustomerRepository;
import com.example.demo1borrar.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer findById( Long id ) {
        return customerRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException(id) );
    }
}
