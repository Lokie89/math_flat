package com.example.mathflat.dto;

import com.example.mathflat.exception.SubjectIdEmptyException;
import com.example.mathflat.exception.SubjectNameEmptyException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Objects;

@Data
public class Subject {
    private long id;
    private String name;

    @JsonIgnore
    public void validateNameNull() {
        if (Objects.isNull(name)) {
            throw new SubjectNameEmptyException();
        }
    }

    @JsonIgnore
    public void validateIdNull() {
        if (Objects.isNull(id) || id < 1) {
            throw new SubjectIdEmptyException();
        }
    }
}
