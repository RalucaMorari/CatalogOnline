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
@Table(name = "Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "grade_id")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "grade_type")
    private GradeTye gradeTye;
    @Column(name = "grade_date")
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference("grade-student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @JsonBackReference("grade-teacher")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonBackReference("course-grade")
    private Course course;

    public Grade() {
    }

    public Grade(Long id, GradeTye gradeTye, LocalDate localDate, Student student, Teacher teacher, Course course) {
        this.id = id;
        this.gradeTye = gradeTye;
        this.localDate = localDate;
        this.student = student;
        this.teacher = teacher;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GradeTye getGradeTye() {
        return gradeTye;
    }

    public void setGradeTye(GradeTye gradeTye) {
        this.gradeTye = gradeTye;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
