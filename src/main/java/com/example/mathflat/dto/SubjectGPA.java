package com.example.mathflat.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class SubjectGPA extends GPA {
    private final Integer subjectCount;

    public SubjectGPA(List<Grade> gradeList) {
        super(gradeList);
        this.subjectCount = gradeList.size();
    }
}
