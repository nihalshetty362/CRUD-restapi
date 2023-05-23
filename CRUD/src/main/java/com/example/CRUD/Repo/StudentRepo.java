package com.example.CRUD.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    void save(Optional<Student> s1);
    
}
