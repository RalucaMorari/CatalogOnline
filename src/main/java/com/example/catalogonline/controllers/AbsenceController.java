package com.example.catalogonline.controllers;

import com.example.catalogonline.services.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/absence")
public class AbsenceController {
    private AbsenceService absenceService;
    @Autowired
    public AbsenceController(AbsenceService absenceService) {
        this.absenceService = absenceService;
    }
}
