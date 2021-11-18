package com.example.onetoone.mappingdemo.repo;

import com.example.onetoone.mappingdemo.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,Long> {
}
