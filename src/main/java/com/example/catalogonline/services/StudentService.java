package com.example.catalogonline.services;

import com.example.catalogonline.dtos.StudentResponseDTO;
import com.example.catalogonline.model.Student;
import com.example.catalogonline.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;
@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(StudentResponseDTO studentResponseDTO){
    Student student= new Student();
    student.setFirstName(studentResponseDTO.getFirstName());
    student.setLastName(studentResponseDTO.getLastName());
    return studentRepository.save(student);
    }

}
