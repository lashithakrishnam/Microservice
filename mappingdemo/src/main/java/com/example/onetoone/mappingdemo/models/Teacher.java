package com.example.onetoone.mappingdemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Long age;
    @ManyToMany
    @JoinTable(name="teacher_student",
            joinColumns =  {@JoinColumn(name="teacher_id")},
            inverseJoinColumns = {@JoinColumn(name="student_id")})
    private List<Student> student = new ArrayList<>();

    public  void addStudent(List<Student> student1) {
       // student1.forEach((n)->student.add(n));

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
