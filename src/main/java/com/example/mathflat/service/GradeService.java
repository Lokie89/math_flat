package com.example.mathflat.service;

import com.example.mathflat.dao.GradeDao;
import com.example.mathflat.dao.StudentDao;
import com.example.mathflat.dao.SubjectDao;
import com.example.mathflat.dto.Grade;
import com.example.mathflat.dto.Student;
import com.example.mathflat.dto.Subject;
import com.example.mathflat.exception.GradeExistException;
import com.example.mathflat.exception.GradePointEmptyException;
import com.example.mathflat.exception.StudentExistException;
import com.example.mathflat.exception.SubjectExistException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class GradeService {

    private final GradeDao gradeDao;
    private final StudentDao studentDao;
    private final SubjectDao subjectDao;

    public GradeService(
            GradeDao gradeDao,
            StudentDao studentDao,
            SubjectDao subjectDao
    ) {
        this.gradeDao = gradeDao;
        this.studentDao = studentDao;
        this.subjectDao = subjectDao;
    }

    private void validateInsertGrade(Grade grade) {
        Student student = grade.getStudent();
        Subject subject = grade.getSubject();
        if (!studentDao.exists(student)) {
            throw new StudentExistException();
        }
        if (!subjectDao.exists(subject)) {
            throw new SubjectExistException();
        }
    }

    private void validateExistGrade(Grade grade) {
        if (!gradeDao.exists(grade)) {
            throw new GradeExistException();
        }
    }

    private void validateUpdateGrade(Grade grade) {
        validateExistGrade(grade);
    }

    private void validateRemoveGrade(Grade grade) {
        validateExistGrade(grade);
    }

    public void insert(Grade grade) {
        validateInsertGrade(grade);
        gradeDao.create(grade);
    }

    public void update(Grade grade) {
        validateUpdateGrade(grade);
        gradeDao.update(grade);
    }

    public void remove(Grade grade) {
        validateRemoveGrade(grade);
        gradeDao.delete(grade);
    }

    private Double getAveragePoint(List<Grade> gradeList) {
        OptionalDouble optionalDouble = gradeList.stream().mapToDouble(Grade::getPoint).average();
        if (optionalDouble.isEmpty()) {
            throw new GradePointEmptyException();
        }
        return optionalDouble.getAsDouble();
    }

    private void validateGradeList(List<?> gradeList) {
        if (gradeList == null || gradeList.size() == 0) {
            throw new GradeExistException();
        }
    }

    public Double getAverageByStudent(Student student) {
        student.validateIdNull();
        List<Grade> gradeListByStudent = gradeDao.findAllByStudent(student);
        validateGradeList(gradeListByStudent);
        return getAveragePoint(gradeListByStudent);
    }

    public Double getAverageBySubject(Subject subject) {
        subject.validateIdNull();
        List<Grade> gradeListBySubject = gradeDao.findAllBySubject(subject);
        validateGradeList(gradeListBySubject);
        return getAveragePoint(gradeListBySubject);
    }
}
