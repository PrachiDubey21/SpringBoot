package com.example.demo.service;

import com.example.demo.dto.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        // try {
        //     Thread.sleep(2000);
        // } catch (Exception e) {
        // }

        studentRepository.save(student);
    }
}
