package com.example.subjectregportal;

import com.example.subjectregportal.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student,Long>{
}
