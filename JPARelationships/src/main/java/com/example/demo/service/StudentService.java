package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.model.Student;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;

    public StudentService(
            StudentRepository studentRepository,
            DepartmentRepository departmentRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    public void createStudent(Student student, Long deptId) {
        Department department =
                departmentRepository.getDepartmentById(deptId);

        student.setDepartment(department);
        department.getStudents().add(student);

        studentRepository.save(student);
    }

    @Transactional
    public void createStudent(Student student, String deptName) {
        Department department = new Department();
        department.setName(deptName);

        departmentRepository.save(department);

        student.setDepartment(department);
        department.getStudents().add(student);

        studentRepository.save(student);
    }
}