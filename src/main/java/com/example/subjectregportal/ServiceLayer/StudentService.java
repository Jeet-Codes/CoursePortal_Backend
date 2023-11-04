package com.example.subjectregportal.ServiceLayer;

import com.example.subjectregportal.Entity.Student;
import com.example.subjectregportal.Response.LoginResponse;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getSt();
    Student stbyId(Long id);
    Student update(Student student,Long id);
    void delete(Long id);

    LoginResponse loginstudent(LoginDto loginDto);
}
