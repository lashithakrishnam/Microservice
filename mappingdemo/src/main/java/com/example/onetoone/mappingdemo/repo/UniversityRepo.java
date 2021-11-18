package com.example.onetoone.mappingdemo.repo;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.models.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UniversityRepo extends JpaRepository<University,Long> {

    @Query("SELECT u.name,u.city,s.age,s.studentName from University u Left Join u.student s    ")
    public List<String> getStudentsAndUniversity();
    //on s.id=u.student.id"
}
