package com.example.mathflat.dto;

import com.example.mathflat.exception.StudentIdEmptyException;
import com.example.mathflat.exception.StudentNameEmptyException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Objects;

@Data
public class Student {
    private Long id;
    private String name;

    @JsonIgnore
    public void validateNameNull() {
        if(Objects.isNull(name)){
            throw new StudentNameEmptyException();
        }
    }

    @JsonIgnore
    public void validateIdNull() {
        if(Objects.isNull(id) || id < 1){
            throw new StudentIdEmptyException();
        }
    }
}
