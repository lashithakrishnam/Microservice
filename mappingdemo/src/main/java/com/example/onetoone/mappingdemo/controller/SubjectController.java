package com.example.onetoone.mappingdemo.controller;

import com.example.onetoone.mappingdemo.models.Subject;
import com.example.onetoone.mappingdemo.repo.SubjectRepo;
import com.example.onetoone.mappingdemo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("University")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping(value = "/subjects")
    public List<Subject> getSubjects() {
        return subjectService.getData();
    }

    @PostMapping(value = "/subjects")
    public String addSubjects(@RequestBody Subject subject) {
       return subjectService.addData(subject);
    }
}
