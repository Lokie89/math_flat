package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class StudentIdEmptyException extends ContainHttpStatusException {

    public StudentIdEmptyException() {
        super("학생의 아이디가 비어있습니다.", HttpStatus.BAD_REQUEST);
    }

}
