package com.example.onetoone.mappingdemo.services;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.models.Teacher;
import com.example.onetoone.mappingdemo.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepo teacherRepo;

    public List<Teacher> getTeachers() {
        return teacherRepo.findAll();
    }

    public Teacher getTeacher(Long id) {
        return teacherRepo.findById(id).get();
    }

    public String setTeacher(Long id, Teacher teacher) {
        Teacher teacherObj = teacherRepo.findById(id).get();
        if(teacher.getName()!=null)
             teacherObj.setName(teacher.getName());
        if(teacher.getAge()!=null)
            teacherObj.setAge(teacher.getAge());
        if(teacher.getStudent()!=null) {
            List<Student> student1=teacher.getStudent();

           // Teacher.addStudent(student1);
            teacherObj.addStudent(student1);
        }
        teacherRepo.save(teacherObj);
        return "Teacher details with the id "+ id+" is updated";

    }

    public String deleteTeacher(Long id) {
        teacherRepo.deleteById(id);
        return "Teacher data with  id "+ id+" is deleted";
    }

    public String addTeacher(Teacher teacher) {
        teacherRepo.save(teacher);
        return "data is add";
    }
}
