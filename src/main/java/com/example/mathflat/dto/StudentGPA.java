package com.example.mathflat.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class StudentGPA extends GPA {
    private final Integer studentCount;

    public StudentGPA(List<Grade> gradeList) {
        super(gradeList);
        this.studentCount = gradeList.size();
    }
}
