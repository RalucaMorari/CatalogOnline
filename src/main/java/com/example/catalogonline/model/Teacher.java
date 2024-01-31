package com.example.catalogonline.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "user _id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_firstName")
    private String firstName;
    @Column(name = "user_lastName")
    private String lastName;
    @Column(name = "user_username")
    private String username;
    @Column(name = "user_password")
    private String password;
    @Column(name ="user_email")
    private String email;
    @Column(name ="user_phoneNumber")
    private String phoneNumber;
}
