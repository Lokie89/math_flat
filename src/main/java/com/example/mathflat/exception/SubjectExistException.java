package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class SubjectExistException extends ContainHttpStatusException {

    public SubjectExistException() {
        super("과목이 존재하지 않습니다.", HttpStatus.NO_CONTENT);
    }

}
