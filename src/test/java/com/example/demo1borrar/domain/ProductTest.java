package com.example.demo1borrar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Validator validator;

    private Product product;

    @BeforeEach
    void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
        product = new Product();
        product.setIdProduct(1);
        product.setPrice(2D);
        product.setName("product 1");
    }

    @DisplayName("Price must be greater than 0")
    @Test
    public void priceGreaterThan() {
        Set<ConstraintViolation<Product>> violations = validator.validate(product);
        assertTrue(violations.isEmpty());

        product.setPrice(-1D);
        violations = validator.validate(product);
        assertFalse(violations.isEmpty());

        product.setPrice(0D);
        violations = validator.validate(product);
        assertFalse(violations.isEmpty());
    }
}