package com.springproject.studentmanagementsystem.service;

import com.springproject.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student editStudent(Student student);
    Student getStudentById(Long id);

    void deleteStudentByid(Long id);
}
