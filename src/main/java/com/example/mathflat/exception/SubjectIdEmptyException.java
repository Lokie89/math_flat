package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class SubjectIdEmptyException extends ContainHttpStatusException {

    public SubjectIdEmptyException() {
        super("과목의 아이디가 비어있습니다.", HttpStatus.BAD_REQUEST);
    }

}
