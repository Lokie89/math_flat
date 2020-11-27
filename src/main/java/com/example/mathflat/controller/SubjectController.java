package com.example.mathflat.controller;

import com.example.mathflat.dto.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubjectController {

    @PostMapping("/subject")
    public ResponseEntity<Subject> addSubject(@RequestParam Subject subject) {
        return new ResponseEntity<>(subject, HttpStatus.CREATED);
    }

    @DeleteMapping("/subject")
    public ResponseEntity<Subject> deleteSubject(@RequestParam Subject subject) {
        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

}
