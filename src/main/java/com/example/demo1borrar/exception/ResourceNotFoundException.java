package com.example.demo1borrar.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super("Resource with id "+id+" not found");
    }

}
