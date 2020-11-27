package com.example.mathflat.dao;

import com.example.mathflat.dto.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentDao {
    void create(Student student);
    List<Student> findAll();
    void deleteById(Long id);
}
