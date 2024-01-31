package com.example.catalogonline.controllers;

import com.example.catalogonline.model.Teacher;
import com.example.catalogonline.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private TeacherService teacherService;
    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
    Teacher newTeacher = teacherService.addTeacher(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTeacher);
    }
}
