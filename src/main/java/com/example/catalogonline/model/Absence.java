package com.example.catalogonline.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "Absence")
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "absence_id")
    private Long id;

    @Column(name= "absence_date")
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference("absence-student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @JsonBackReference("absence-teacher")
    private Teacher teacher;

    public Absence() {
    }

    public Absence(Long id, LocalDate localDate, Student student, Teacher teacher) {
        this.id = id;
        this.localDate = localDate;
        this.student = student;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
