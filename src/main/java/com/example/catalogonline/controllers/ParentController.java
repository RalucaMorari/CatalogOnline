package com.example.catalogonline.controllers;

import com.example.catalogonline.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class ParentController {
    private ParentService parentService;
    @Autowired
    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }
}
