package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public abstract class ContainHttpStatusException extends RuntimeException {

    private final String message;
    private final HttpStatus httpStatus;

    public ContainHttpStatusException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
