package com.example.mathflat.exception;

public class MandatoryNullException extends RuntimeException {
    final String message = "필수 데이터가 없습니다.";

    @Override
    public String getMessage() {
        return message;
    }
}
