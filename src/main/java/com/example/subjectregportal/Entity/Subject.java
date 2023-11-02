package com.example.subjectregportal.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;
    @Column(nullable = false)
    private String coursename;
    @Column(nullable = false)
    private String authorname;
    @Column(length = 1000)
    private String coursedesc;
    @Column(nullable = false)
    private Integer coursecredit;

    public Subject(Long cid, String coursename, String authorname, String coursedesc, Integer coursecredit) {
        this.cid = cid;
        this.coursename = coursename;
        this.authorname = authorname;
        this.coursedesc = coursedesc;
        this.coursecredit = coursecredit;
    }

    public Subject() {
    }

    @Override
    public String toString() {
        return "Subject{" +
                "cid=" + cid +
                ", coursename='" + coursename + '\'' +
                ", authorname='" + authorname + '\'' +
                ", coursedesc='" + coursedesc + '\'' +
                ", coursecredit=" + coursecredit +
                '}';
    }
}
