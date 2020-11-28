package com.example.mathflat.service;

import com.example.mathflat.dao.GradeDao;
import com.example.mathflat.dao.StudentDao;
import com.example.mathflat.dto.Student;
import com.example.mathflat.exception.StudentExistException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    private final StudentDao studentDao;
    private final GradeDao gradeDao;

    public StudentService(StudentDao studentDao,
                          GradeDao gradeDao) {
        this.studentDao = studentDao;
        this.gradeDao = gradeDao;
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

    @Transactional
    public void remove(Student student) {
        validateRemoveStudent(student);
        gradeDao.deleteByStudent(student);
        studentDao.delete(student);
    }

}
