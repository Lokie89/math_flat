package com.example.mathflat.dao;

import com.example.mathflat.dto.Grade;
import com.example.mathflat.dto.Student;
import com.example.mathflat.dto.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GradeDao {
    void create(Grade grade);
    void update(Grade grade);
    Boolean exists(Grade grade);
    void delete(Grade grade);
    List<Grade> findAllByStudent(Student student);
    List<Grade> findAllBySubject(Subject subject);
}
