package com.springBoot.restFulDemo.rest;

import com.springBoot.restFulDemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        return null;
    }

}
