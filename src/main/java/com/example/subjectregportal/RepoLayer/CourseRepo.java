package com.example.subjectregportal.RepoLayer;

import com.example.subjectregportal.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
