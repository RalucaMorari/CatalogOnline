package com.example.catalogonline.repositories;

import com.example.catalogonline.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository  extends JpaRepository<Grade, Long> {
}
