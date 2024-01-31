package com.example.catalogonline.controllers;

import com.example.catalogonline.dtos.StudentResponseDTO;
import com.example.catalogonline.model.Student;
import com.example.catalogonline.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;
@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody StudentResponseDTO studentResponseDTO){
    Student newStudent = studentService.addStudent(studentResponseDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }
}

