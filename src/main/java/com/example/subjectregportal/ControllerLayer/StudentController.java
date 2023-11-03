package com.example.subjectregportal.ControllerLayer;

import com.example.subjectregportal.Entity.Student;
import com.example.subjectregportal.ServiceLayer.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController  {

    @Autowired
    private  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/get")
    public List<Student> StudentDetails(){
        return studentService.getSt();
    }


    @PostMapping("/portal/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/portal/{id}")
    public Student getbyid(@PathVariable("id")Long id){
        return studentService.stbyId(id);
    }


    @PutMapping("/portal/{id}")
    public  ResponseEntity<String> updateStudent(@PathVariable("id")Long id,@RequestBody Student student){
        studentService.update(student,id);
        return new ResponseEntity<String>("Updated Successfully",HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/portal/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id")Long id){
        studentService.delete(id);
        return new ResponseEntity<String>("Deleted Successfully",HttpStatus.FOUND);
    }
}
