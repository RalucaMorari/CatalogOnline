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
@Table(name = "Teacher")
public class Teacher {

    @Id
    @Column(name = "teacher _id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "teacher_firstName")
    private String firstName;
    @Column(name = "teacher_lastName")
    private String lastName;
    @Column(name = "teacher_username")
    private String username;
    @Column(name = "teacher_password")
    private String password;
    @Column(name = "teacher_email")
    private String email;
    @Column(name = "teacher_phoneNumber")
    private String phoneNumber;

    @ManyToMany
    @JoinTable(
            name = "schoolClass-teacher",
            joinColumns = {@JoinColumn(name = "teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "schoolClass_id")})
    @JsonManagedReference("schoolClass-teacher")
    private List<SchoolClass> schoolClasses;

    @ManyToMany
    @JoinTable(
            name = "teacher-course",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "teacher_id")})
    @JsonBackReference("course-teacher")
    private List<Course> courses;

    @ManyToMany
    @JoinTable(
            name = "teacher-role",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "teacher_id")})
    @JsonBackReference("teacher-role")
    private List<Role> roles;

    @OneToMany(mappedBy = "teacher", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    @JsonManagedReference("teacher-grade")
    private List<Grade> grades;

    @OneToMany(mappedBy = "teacher", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    @JsonManagedReference("teacher-absence")
    private List<Absence> absences;

    public Teacher() {
    }

    public Teacher(Long id, String firstName, String lastName, String username, String password, String email,
                   String phoneNumber, List<SchoolClass> schoolClasses, List<Course> courses, List<Role> roles,
                   List<Grade> grades, List<Absence> absences) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.schoolClasses = schoolClasses;
        this.courses = courses;
        this.roles = roles;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(List<SchoolClass> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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
