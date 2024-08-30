package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Student;
import com.example.LibraryManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
}
