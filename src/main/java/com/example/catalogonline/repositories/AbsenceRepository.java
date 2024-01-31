package com.example.catalogonline.repositories;

import com.example.catalogonline.model.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceRepository  extends JpaRepository<Absence, Long> {
}
