package com.example.onetoone.mappingdemo.controller;

import com.example.onetoone.mappingdemo.models.Teacher;
import com.example.onetoone.mappingdemo.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("University")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping(value="/teachers")
    public List<Teacher> getTeachers()
    {
        return teacherService.getTeachers();
    }
    @GetMapping(value="teachers/{id}")
    public Teacher getTeacher(@PathVariable Long id)
    {
        return teacherService.getTeacher(id);
    }
    @PostMapping(value="teachers")
    public String addTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.addTeacher(teacher);
    }
    @PutMapping(value="teachers/{id}")
    public String updateTeacher(@PathVariable Long id,@RequestBody Teacher teacher)
    {
        return teacherService.setTeacher(id,teacher);
    }
    @DeleteMapping(value="teachers/{id}")
    public String deleteTeacher(@PathVariable Long id)
    {
        return teacherService.deleteTeacher(id);
    }

}
