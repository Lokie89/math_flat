package com.example.mathflat.service;

import com.example.mathflat.dao.StudentDao;
import com.example.mathflat.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    private void validateStudent(Student student) {

    }

    public void insertStudent(Student student) {

        studentDao.create(student);
    }
}
