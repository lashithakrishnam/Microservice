package com.example.onetoone.mappingdemo.services;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.models.Subject;
import com.example.onetoone.mappingdemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;


    public List<Student> getStudents() {

        return studentRepo.findAll();
    }

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student data is updated";
    }

    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        return "Student with id "+id +" data is deleted";
    }

    public String updateStudent(Long id, Student student) {
        Student studentobj = studentRepo.findById(id).get();

        if(student.getStudentName()!=null)
       studentobj.setStudentName(student.getStudentName());
        if(student.getAge()!=null)
       studentobj.setAge(student.getAge());
        if(student.getSubject()!=null)
       studentobj.setSubject(student.getSubject());
       studentRepo.save(studentobj);

        return "Student with id "+ id +" data is updated ";
    }

    public Student getStudent(Long id) {

        return studentRepo.findById(id).get();
    }

   public List<String> getSubjectStudent() {
        return studentRepo.getStudentsSubject();
    }
}
