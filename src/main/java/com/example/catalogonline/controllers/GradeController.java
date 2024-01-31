package com.example.catalogonline.controllers;

import com.example.catalogonline.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
public class GradeController {
    private GradeService gradeService;
    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }
}
