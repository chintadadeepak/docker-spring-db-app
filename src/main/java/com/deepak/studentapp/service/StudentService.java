package com.deepak.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.studentapp.dao.StudentRepository;
import com.deepak.studentapp.models.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent() {
        Student student = new Student();
        student.setName("Reddy");
        student.setAge(35);
        studentRepository.save(student);
    }
}
