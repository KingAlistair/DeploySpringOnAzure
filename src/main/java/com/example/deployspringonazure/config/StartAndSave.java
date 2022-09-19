package com.example.deployspringonazure.config;

import com.example.deployspringonazure.model.Student;
import com.example.deployspringonazure.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class StartAndSave implements CommandLineRunner {

    StudentRepository studentRepository;

    public StartAndSave(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("Billy");
        student.setBorn(LocalDate.now());
        student.setBornTime(LocalTime.now());
        studentRepository.save(student);
    }

}
