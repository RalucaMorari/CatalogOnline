package com.example.catalogonline.dtos;

import jakarta.persistence.Column;

public class ParentRespponseDTO {

    @Column(name = "parent_username")
    private String username;
    @Column(name = "parent_password")
    private String password;
    @Column(name ="parent_email")
    private String email;
    @Column(name ="parent_phoneNumber")
    private String phoneNumber;

    public ParentRespponseDTO() {
    }

    public ParentRespponseDTO(String username, String password, String email, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
