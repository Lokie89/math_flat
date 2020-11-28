package com.example.mathflat.controller;

import com.example.mathflat.dto.Subject;
import com.example.mathflat.service.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/subject")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        subjectService.insert(subject);
        return new ResponseEntity<>(subject, HttpStatus.CREATED);
    }

    @DeleteMapping("/subject")
    public ResponseEntity<Subject> deleteSubject(@RequestBody Subject subject) {
        subjectService.remove(subject);
        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

}
