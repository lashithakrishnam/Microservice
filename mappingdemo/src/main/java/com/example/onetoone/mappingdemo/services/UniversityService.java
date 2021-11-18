package com.example.onetoone.mappingdemo.services;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.models.University;
import com.example.onetoone.mappingdemo.repo.UniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {
    @Autowired
    UniversityRepo universityRepo;

    public void addDatatoDatabase(University university) {

        universityRepo.save(university);

    }

    public List<University> getData() {
       return universityRepo.findAll();
    }

    public String deleteData(long id) {
       University deleteUniversity = universityRepo.findById(id).get();
       universityRepo.delete(deleteUniversity);

        return "Data of university with id "+ id + "is deleted";
    }

    public String dataUpdateById(long id, University university) {

        University universityObj = universityRepo.findById(id).get();
        Student studentobj =university.getStudent();

        if(university.getCity()!=null)
        universityObj.setCity(university.getCity());
        if(university.getName()!=null)
        universityObj.setName(university.getName());
       // System.out.println("debug 11"+universityObj.getStudent().getAge());
       // System.out.println("debug 12 "+universityObj.getStudent().getStudentName());
        if(university.getStudent().getStudentName()==null)
        {
               studentobj.setStudentName(universityObj.getStudent().getStudentName());

        }
            if(university.getStudent().getAge()==null) {
                System.out.println("debug "+universityObj.getStudent().getAge());

                studentobj.setAge(universityObj.getStudent().getAge());

        }
            universityObj.setStudent(studentobj);
        universityRepo.save(universityObj);


        return "values are updated";
    }

    public University dataGetById(long id) {

        University universityObj = universityRepo.findById(id).get();
        return universityObj;

    }

    public List<String> getStudentsAndUniversity() {
       return universityRepo.getStudentsAndUniversity();
    }
}
