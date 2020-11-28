package com.example.mathflat.service;

import com.example.mathflat.dao.SubjectDao;
import com.example.mathflat.dto.Subject;
import com.example.mathflat.exception.StudentExistException;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    private final SubjectDao subjectDao;

    public SubjectService(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    private void validateInsertSubject(Subject subject) {
        subject.validateNameNull();
    }

    private void validateRemoveSubject(Subject subject) {
        subject.validateNameNull();
        subject.validateIdNull();
        if (!subjectDao.exists(subject)) {
            throw new StudentExistException();
        }
    }

    public void insert(Subject subject) {
        validateInsertSubject(subject);
        subjectDao.create(subject);
    }

    public void remove(Subject subject) {
        validateRemoveSubject(subject);
        subjectDao.delete(subject);
    }


}
