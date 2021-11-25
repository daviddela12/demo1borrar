package com.example.demo1borrar.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private Integer statusCode;
    private Date date;
    private String message;
}
