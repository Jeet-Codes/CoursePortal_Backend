package com.example.subjectregportal.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String coursename;

    private String author;

    @Column(nullable = false)
    private String coursedetail;

    private Integer credit;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", author='" + author + '\'' +
                ", coursedetail='" + coursedetail + '\'' +
                ", credit=" + credit +
                '}';
    }

    public Course(long id, String coursename, String author, String coursedetail, Integer credit) {
        this.id = id;
        this.coursename = coursename;
        this.author = author;
        this.coursedetail = coursedetail;
        this.credit = credit;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoursedetail() {
        return coursedetail;
    }

    public void setCoursedetail(String coursedetail) {
        this.coursedetail = coursedetail;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
