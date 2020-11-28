package com.example.mathflat.dto;

import lombok.Data;

@Data
public class Grade {
    private Student student;
    private Subject subject;

    private Double point;
}
