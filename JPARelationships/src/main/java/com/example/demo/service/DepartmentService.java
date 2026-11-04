package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.model.Student;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final StudentRepository studentRepository;

    public DepartmentService(
            DepartmentRepository departmentRepository,
            StudentRepository studentRepository) {
        this.departmentRepository = departmentRepository;
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Transactional
    public void createDepartment(
            Department department,
            String studentName) {

        Student student = new Student();
        student.setName(studentName);
        student.setDepartment(department);

        department.getStudents().add(student);

        studentRepository.save(student);
        departmentRepository.save(department);
    }
}