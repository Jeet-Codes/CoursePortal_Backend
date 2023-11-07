package com.example.subjectregportal.ServiceLayer;

import com.example.subjectregportal.Entity.Course;


import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);
    List<Course> getCs();
    Course CsbyId(Long id);
    Course update(Course course,Long id);
    void delete(Long id);

}
