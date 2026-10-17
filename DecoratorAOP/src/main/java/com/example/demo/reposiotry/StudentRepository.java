package com.example.demo.repository;

import com.example.demo.dto.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void save(Student student) {
        System.out.println("Student saved");
    }
}
