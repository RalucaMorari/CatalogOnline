package com.example.catalogonline.repositories;

import com.example.catalogonline.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
