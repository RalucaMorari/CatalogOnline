package com.example.catalogonline.services;

import com.example.catalogonline.dtos.SchoolClassResponseDTO;
import com.example.catalogonline.model.SchoolClass;
import com.example.catalogonline.repositories.SchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolClassService {
    private SchoolClassRepository schoolClassRepository;

    @Autowired
    public SchoolClassService(SchoolClassRepository schoolClassRepository) {
        this.schoolClassRepository = schoolClassRepository;
    }

    public SchoolClass addSchoolClass (SchoolClassResponseDTO schoolClassResponseDTO){
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setSchoolClassType(schoolClassResponseDTO.getSchoolClassType());
        return schoolClassRepository.save(schoolClass);
    }
}
