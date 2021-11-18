package com.example.onetoone.mappingdemo.repo;

import com.example.onetoone.mappingdemo.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
