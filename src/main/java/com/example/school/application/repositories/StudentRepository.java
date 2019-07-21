package com.example.school.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.school.application.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
