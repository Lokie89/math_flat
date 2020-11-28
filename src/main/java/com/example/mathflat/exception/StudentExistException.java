package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class StudentExistException extends ContainHttpStatusException {

    public StudentExistException() {
        super("학생이 존재하지 않습니다.", HttpStatus.NO_CONTENT);
    }

}
