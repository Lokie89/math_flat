package com.example.mathflat.controller;

import com.example.mathflat.exception.ContainHttpStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(ContainHttpStatusException.class)
    public ResponseEntity<String> exception(ContainHttpStatusException e) {
        return new ResponseEntity<>(e.getMessage(), e.getHttpStatus());
    }
}
