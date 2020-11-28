package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class GradeExistException extends ContainHttpStatusException {

    public GradeExistException() {
        super("성적이 존재하지 않습니다.", HttpStatus.NO_CONTENT);
    }

}
