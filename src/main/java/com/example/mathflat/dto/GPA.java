package com.example.mathflat.dto;

import com.example.mathflat.exception.GradePointEmptyException;
import lombok.Getter;

import java.util.List;
import java.util.OptionalDouble;

@Getter
public abstract class GPA implements Statistics {
    private final List<Grade> gradeList;
    private Double gradePointAverage;

    public GPA(List<Grade> gradeList) {
        this.gradeList = gradeList;
        average();
    }

    @Override
    public void average() {
        OptionalDouble optionalDouble = gradeList.stream().mapToDouble(Grade::getPoint).average();
        if (optionalDouble.isEmpty()) {
            throw new GradePointEmptyException();
        }
        gradePointAverage = optionalDouble.getAsDouble();
    }
}
