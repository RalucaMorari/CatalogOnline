package com.example.catalogonline.repositories;

import com.example.catalogonline.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//public Optional<Student> findStudentsByLastNameAndFirstName(String firstName, String lastName){
//    return optionalStudent;
//}
}



