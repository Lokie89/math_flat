package com.example.mathflat.service;

import com.example.mathflat.dao.GradeDao;
import com.example.mathflat.dao.SubjectDao;
import com.example.mathflat.dto.Subject;
import com.example.mathflat.exception.StudentExistException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubjectService {
    private final SubjectDao subjectDao;
    private final GradeDao gradeDao;

    public SubjectService(SubjectDao subjectDao,
                          GradeDao gradeDao) {
        this.subjectDao = subjectDao;
        this.gradeDao = gradeDao;
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

    @Transactional
    public void remove(Subject subject) {
        validateRemoveSubject(subject);
        gradeDao.deleteBySubject(subject);
        subjectDao.delete(subject);
    }


}
