package com.example.onetoone.mappingdemo.repo;

import com.example.onetoone.mappingdemo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.onetoone.mappingdemo.models.Teacher;
import com.example.onetoone.mappingdemo.models.University;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

public interface StudentRepo extends JpaRepository<Student,Long> {
   @Query("SELECT s.studentName,s.age,su.name from   Student s Join s.subject su where s.id=su.id")
   public List<String> getStudentsSubject();
//where s.id=su.student.id
}
