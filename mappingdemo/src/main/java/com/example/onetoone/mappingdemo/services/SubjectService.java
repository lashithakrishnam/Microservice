package com.example.onetoone.mappingdemo.services;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.models.Subject;
import com.example.onetoone.mappingdemo.repo.StudentRepo;
import com.example.onetoone.mappingdemo.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepo subjectRepo;
    @Autowired
    StudentRepo studentRepo;

    public String addData(Subject subject) {
        subjectRepo.save(subject);

        return "Data is added";
    }

    public List<Subject> getData() {
        return subjectRepo.findAll();
    }
}
