package com.example.demo1borrar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Validator validator;

    private Customer customer;

    @BeforeEach
    void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
        customer = new Customer();
        customer.setIdCustomer(1);
        customer.setName("Nombre");
        customer.setNif("12345678P");
    }

    @DisplayName("Name and Nif are required")
    @Test
    public void nameAndNifMustNotBeNull() {
        Set<ConstraintViolation<Customer>> constraintValidatorSet = validator.validate(customer);
        assertTrue(constraintValidatorSet.isEmpty());

        customer.setNif(null);
        constraintValidatorSet = validator.validate(customer);
        assertFalse(constraintValidatorSet.isEmpty());

        customer.setName(null);
        constraintValidatorSet = validator.validate(customer);
        assertFalse(constraintValidatorSet.isEmpty());
    }
}