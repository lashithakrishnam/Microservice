package com.example.onetoone.mappingdemo.models;

import javax.persistence.*;

import java.util.List;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String studentName;
    @Column
    private String age;


    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

  /*  @OneToMany(cascade= CascadeType.ALL,mappedBy="student")
   // @JoinColumn(name = "student_id")
    private List<Subject> subject;*/

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
