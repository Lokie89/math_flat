package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class StudentNameEmptyException extends ContainHttpStatusException {

    public StudentNameEmptyException() {
        super("학생의 이름이 비어있습니다.", HttpStatus.BAD_REQUEST);
    }

}
