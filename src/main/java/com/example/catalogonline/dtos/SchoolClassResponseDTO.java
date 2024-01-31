package com.example.catalogonline.dtos;

import com.example.catalogonline.model.SchoolClassType;
import jakarta.persistence.Column;

public class SchoolClassResponseDTO {
    @Column(name = "schoolClass _type")
    private SchoolClassType schoolClassType;

    public SchoolClassResponseDTO() {
    }

    public SchoolClassResponseDTO(SchoolClassType schoolClassType) {
        this.schoolClassType = schoolClassType;
    }

    public SchoolClassType getSchoolClassType() {
        return schoolClassType;
    }

    public void setSchoolClassType(SchoolClassType schoolClassType) {
        this.schoolClassType = schoolClassType;
    }
}
