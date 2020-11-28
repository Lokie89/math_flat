package com.example.mathflat.controller;

import com.example.mathflat.dto.Student;
import com.example.mathflat.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.insert(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("/student")
    public ResponseEntity<Student> deleteStudent(@RequestBody Student student) {
        studentService.remove(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
