package com.example.subjectregportal.ServiceLayer;

import com.example.subjectregportal.Entity.Course;
import com.example.subjectregportal.RepoLayer.CourseRepo;
import com.example.subjectregportal.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImp implements CourseService{

    @Autowired
    private CourseRepo courseRepo;

    public CourseServiceImp(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public List<Course> getCs() {
        return courseRepo.findAll();
    }

    @Override
    public Course CsbyId(Long id) {
        Optional<Course> Cs=courseRepo.findById(id);
        if(Cs.isPresent()){
            return  Cs.get();
        }else{
            throw new StudentNotFoundException("Course","Courseid",id);
        }
    }

    @Override
    public Course update(Course course, Long id) {
        courseRepo.findById(id);
        courseRepo.findById(id).orElseThrow(()-> new StudentNotFoundException("Course","Courseid",id));
        courseRepo.save(course);
        return course;
    }

    @Override
    public void delete(Long id) {
        courseRepo.findById(id).orElseThrow(()
                ->new StudentNotFoundException("Course","Courseid",id));
        courseRepo.deleteById(id);
    }

}
