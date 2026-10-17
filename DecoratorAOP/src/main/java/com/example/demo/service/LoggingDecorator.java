package com.example.demo.service;

import com.example.demo.dto.Student;
import org.springframework.stereotype.Component;

@Component
public class LoggingDecorator implements StudentService {

    private final StudentServiceImpl studentServiceImpl;

    public LoggingDecorator(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @Override
    public void createStudent(Student student) {

        // Logging related logic
        LoggingServiceUtil.logStart(
                "StudentServiceImpl", "createStudent");

        studentServiceImpl.createStudent(student);

        LoggingServiceUtil.logEnd(
                "StudentServiceImpl", "createStudent");
    }
}
