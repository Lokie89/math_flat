package com.example.mathflat.exception;

import org.springframework.http.HttpStatus;

public class SubjectNameEmptyException extends ContainHttpStatusException {

    public SubjectNameEmptyException() {
        super("과목의 이름이 비어있습니다.", HttpStatus.BAD_REQUEST);
    }

}
