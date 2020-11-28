package com.example.mathflat.service;

import com.example.mathflat.dao.StudentDao;
import com.example.mathflat.dto.Student;
import com.example.mathflat.exception.StudentExistException;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    private void validateInsertStudent(Student student) {
        student.validateNameNull();
    }

    private void validateRemoveStudent(Student student) {
        student.validateNameNull();
        student.validateIdNull();
        if (!studentDao.exists(student)) {
            throw new StudentExistException();
        }
    }

    public void insert(Student student) {
        validateInsertStudent(student);
        studentDao.create(student);
    }

    public void remove(Student student) {
        validateRemoveStudent(student);
        studentDao.delete(student);
    }

}
