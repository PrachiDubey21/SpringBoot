package com.example.demo.service;

import com.example.demo.dto.Student;

public interface StudentServiceInterface {

    Student createStudent(Student student);

    String getStudent(String s);
}
