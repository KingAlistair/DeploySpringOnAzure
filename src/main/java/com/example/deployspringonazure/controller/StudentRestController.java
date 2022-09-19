package com.example.deployspringonazure.controller;

import com.example.deployspringonazure.model.Student;
import com.example.deployspringonazure.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("students")
    public List<Student> student() {
        List<Student> list = studentRepository.findAll();
        return list;
    }
}
