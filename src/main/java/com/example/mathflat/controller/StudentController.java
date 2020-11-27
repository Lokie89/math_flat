package com.example.mathflat.controller;

import com.example.mathflat.dto.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestParam Student student) {
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("/student")
    public ResponseEntity<Student> deleteStudent(@RequestParam Student student) {
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
