package com.example.school.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.school.application.entity.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long>{

}
