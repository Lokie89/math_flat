package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class GradePointEmptyException extends ContainHttpStatusException {

    public GradePointEmptyException() {
        super("점수가 비어있습니다.", HttpStatus.NO_CONTENT);
    }

}
