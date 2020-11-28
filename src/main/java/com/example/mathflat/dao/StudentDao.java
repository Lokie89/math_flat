package com.example.mathflat.dao;

import com.example.mathflat.dto.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    Long create(Student student);
    void delete(Student student);
    Boolean exists(Student student);
}
