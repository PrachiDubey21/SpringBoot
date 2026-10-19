package com.example.demo.service;

import com.example.demo.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceInterface {

    @Override
    public Student createStudent(Student student) {
        System.out.println("Student saved");
        return student;
    }

    @Override
    public String getStudent(String s) {
        System.out.println(s);
        return s;
    }

    public int dummyMethod() {
        return 0;
    }
}
