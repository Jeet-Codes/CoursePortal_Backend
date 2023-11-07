package com.example.subjectregportal.ControllerLayer;

import com.example.subjectregportal.Entity.Course;
import com.example.subjectregportal.Entity.Student;
import com.example.subjectregportal.ServiceLayer.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/course/get")
    public List<Course> CourseDetails(){
        return courseService.getCs();
    }

    @PostMapping("/course/save")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course){
        return new ResponseEntity<Course>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @GetMapping("/course/{id}")
    public Course Coursebyid(@PathVariable("id")Long id){
        return courseService.CsbyId(id);
    }

    @PutMapping("/course/{id}")
    public  ResponseEntity<String> updateCourse(@PathVariable("id")Long id,@RequestBody Course course){
        courseService.update(course,id);
        return new ResponseEntity<String>("Updated Successfully",HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/course/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable("id")Long id){
        courseService.delete(id);
        return new ResponseEntity<String>("Deleted Successfully",HttpStatus.FOUND);
    }



}
