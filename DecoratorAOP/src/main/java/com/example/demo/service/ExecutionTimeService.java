package com.example.demo.service;

import com.example.demo.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExecutionTimeService implements StudentService {

    private final LoggingDecorator loggingDecorator;

    public ExecutionTimeService(LoggingDecorator loggingDecorator) {
        this.loggingDecorator = loggingDecorator;
    }

    @Override
    public void createStudent(Student student) {

        long start = System.currentTimeMillis();

        loggingDecorator.createStudent(student);

        long end = System.currentTimeMillis();

        System.out.println("Execution time: " + (end - start) + " ms");
    }
}
