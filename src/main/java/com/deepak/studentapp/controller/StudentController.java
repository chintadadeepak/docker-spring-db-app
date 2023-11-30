package com.deepak.studentapp.controller;

import com.deepak.studentapp.models.Student;
import com.deepak.studentapp.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @RequestMapping("addStudent")
    public String addStudent() {
        studentService.addStudent();
        return "Successfull";
    }

}
