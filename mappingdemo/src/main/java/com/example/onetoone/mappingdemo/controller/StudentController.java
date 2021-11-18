package com.example.onetoone.mappingdemo.controller;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("University")
public class StudentController {

    @Autowired
    StudentService studentService;
   @GetMapping(value = "/students/subject")
    public List<String> getStuSub()
    {
        return studentService.getSubjectStudent();
    }

    @GetMapping(value="/students")
    public List<Student> getStudentData()
    {
        return studentService.getStudents();
    }
    @GetMapping(value="/students/id")
    public Student getStudent(@PathVariable Long id)
    {
        return studentService.getStudent(id);
    }
    @PostMapping(value="/students")
    public String addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
    @PutMapping(value="/students/{id}")
    public String updateStudent(@RequestBody Student student,@PathVariable Long id)
    {
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping (value="students/{id}")
    public String deletestudent(@PathVariable Long id)
    {
        return studentService.deleteStudent(id);
    }


}
