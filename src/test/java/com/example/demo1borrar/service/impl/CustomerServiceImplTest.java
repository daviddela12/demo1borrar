package com.example.demo1borrar.service.impl;

import com.example.demo1borrar.domain.Customer;
import com.example.demo1borrar.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceImplTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerServiceImpl;

    private Customer customerMocked;

    @BeforeEach
    void setUp() {
        customerMocked = new Customer();
        customerMocked.setIdCustomer(1l);
        customerMocked.setName("Name");
        customerMocked.setNif("12345678Z");
        when(customerRepository.getById(1L)).thenReturn(customerMocked);
    }

    @DisplayName("Service call to repository find By Id")
    @Test
    void findById() {
        Customer customer = new Customer();
        customer.setIdCustomer(1l);
        customer.setName("Name");
        customer.setNif("12345678Z");
        Customer response = customerServiceImpl.getById(customer.getIdCustomer());
        verify(customerRepository, times(1)).getById(any(Long.class));
    }
}