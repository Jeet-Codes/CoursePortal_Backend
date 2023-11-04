package com.example.subjectregportal;

import com.example.subjectregportal.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface StudentRepo extends JpaRepository<Student,Long>{
    Optional<Student>findOneByEmailAndPassword(String email,String password);
    Student findByEmail(String email);
}
