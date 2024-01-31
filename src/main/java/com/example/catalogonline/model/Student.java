package com.example.catalogonline.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "student _id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "student_firstName")
    private String firstName;
    @Column(name = "student_lastName")
    private String lastName;
    @Column(name = "student_username")
    private String username;
    @Column(name = "student_password")
    private String password;
    @Column(name = "student_email")
    private String email;
    @Column(name = "student_age")
    private Integer age;
    @Column(name = "student_genre")
    private String genre;

    @ManyToOne
    @JoinColumn(name = "schoolClass_id")
    @JsonBackReference("student-schoolClass")
    private SchoolClass schoolClass;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    @JsonBackReference("student-parent")
    private Parent parent;

    @OneToMany(mappedBy = "student", cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JsonManagedReference("student-grade")
    private List<Grade> grades;

    @OneToMany(mappedBy = "student", cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JsonManagedReference("student-absence")
    private List<Absence> absences;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String username, String password, String email,
                   Integer age, String genre, SchoolClass schoolClass, Parent parent, List<Grade> grades,
                   List<Absence> absences) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.genre = genre;
        this.schoolClass = schoolClass;
        this.parent = parent;
        this.grades = grades;
        this.absences = absences;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public List<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }
}

