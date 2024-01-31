package com.example.catalogonline.dtos;

import jakarta.persistence.Column;

public class StudentResponseDTO {
    @Column
    private String firstName;
    @Column
    private String lastName;

    public StudentResponseDTO() {
    }

    public StudentResponseDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
