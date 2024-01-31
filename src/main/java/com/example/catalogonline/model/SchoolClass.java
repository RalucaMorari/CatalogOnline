package com.example.catalogonline.model;

import jakarta.persistence.*;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;
    @Column
    private ClassType classType;
}
