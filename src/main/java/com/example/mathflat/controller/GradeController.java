package com.example.mathflat.controller;

import com.example.mathflat.dto.Grade;
import com.example.mathflat.dto.Student;
import com.example.mathflat.dto.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class GradeController {

    @PostMapping("/grade")
    public ResponseEntity<Grade> addGrade(@RequestParam Grade grade) {
        return new ResponseEntity<>(grade, HttpStatus.CREATED);
    }

    @PutMapping("/grade")
    public ResponseEntity<Grade> updateGrade(@RequestParam Grade grade) {
        return new ResponseEntity<>(grade, HttpStatus.OK);
    }

    @DeleteMapping("/grade")
    public ResponseEntity<Grade> deleteGrade(@RequestParam Grade grade) {
        return new ResponseEntity<>(grade, HttpStatus.OK);
    }

    @GetMapping("/grade")
    public ResponseEntity<Double> getAverageGrade(@RequestParam Student student) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/grade")
    public ResponseEntity<Double> getAverageGrade(@RequestParam Subject subject) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
