package com.example.catalogonline.controllers;

import com.example.catalogonline.dtos.SchoolClassResponseDTO;
import com.example.catalogonline.model.SchoolClass;
import com.example.catalogonline.services.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schoolClass")
public class SchoolClassController {
    private SchoolClassService schoolClassService;

    @Autowired
    public SchoolClassController(SchoolClassService schoolClassService) {
        this.schoolClassService = schoolClassService;
    }
    @PostMapping("/")
    public ResponseEntity<SchoolClass> addSchoolClass(@RequestBody SchoolClassResponseDTO schoolClassResponseDTO){
        SchoolClass newSchoolClass = schoolClassService.addSchoolClass(schoolClassResponseDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(newSchoolClass);
    }

}
