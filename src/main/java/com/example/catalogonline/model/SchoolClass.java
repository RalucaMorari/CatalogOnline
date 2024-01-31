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
@Table(name = "SchoolClass")
public class SchoolClass {

    @Id
    @Column(name = "schoolClass _id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "schoolClass _type")
    private SchoolClassType schoolClassType;

    @OneToMany(mappedBy = "schoolClass", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonManagedReference("student-schoolClass")
    private List<Student> students;

    @ManyToMany
    @JoinTable(
            name = "schoolClass-course",
            joinColumns = {@JoinColumn(name = "schoolClass_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    @JsonBackReference("schoolClass-course")
    private List<Course> courses;

    @ManyToMany
    @JoinTable(
            name = "schoolClass-teacher",
            joinColumns = {@JoinColumn(name = "schoolClass_id")},
            inverseJoinColumns = {@JoinColumn(name = "teacher_id")})
    @JsonBackReference("teacher-schoolClass")
    private List<Teacher> teachers;

    public SchoolClass() {
    }

    public SchoolClass(Long id, SchoolClassType schoolClassType, List<Student> students,
                       List<Course> courses, List<Teacher> teachers) {
        this.id = id;
        this.schoolClassType = schoolClassType;
        this.students = students;
        this.courses = courses;
        this.teachers = teachers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SchoolClassType getSchoolClassType() {
        return schoolClassType;
    }

    public void setSchoolClassType(SchoolClassType schoolClassType) {
        this.schoolClassType = schoolClassType;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
