package com.example.mathflat.controller;

import com.example.mathflat.dto.Grade;
import com.example.mathflat.dto.Student;
import com.example.mathflat.dto.Subject;
import com.example.mathflat.service.GradeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping("/grade")
    public ResponseEntity<Grade> addGrade(@RequestBody Grade grade) {
        gradeService.insert(grade);
        return new ResponseEntity<>(grade, HttpStatus.CREATED);
    }

    @PutMapping("/grade")
    public ResponseEntity<Grade> updateGrade(@RequestBody Grade grade) {
        gradeService.update(grade);
        return new ResponseEntity<>(grade, HttpStatus.OK);
    }

    @DeleteMapping("/grade")
    public ResponseEntity<Grade> deleteGrade(@RequestBody Grade grade) {
        gradeService.remove(grade);
        return new ResponseEntity<>(grade, HttpStatus.OK);
    }

    @GetMapping("/gpa-student")
    public ResponseEntity<Double> getGradePointAverageByStudent(@ModelAttribute Student student) {
        Double average = gradeService.getAverageByStudent(student);
        return new ResponseEntity<>(average, HttpStatus.OK);
    }

    @GetMapping("/gpa-subject")
    public ResponseEntity<Double> getGradePointAverageBySubject(@ModelAttribute Subject subject) {
        Double average = gradeService.getAverageBySubject(subject);
        return new ResponseEntity<>(average, HttpStatus.OK);
    }

}
