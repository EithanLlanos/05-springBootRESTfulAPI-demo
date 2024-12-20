package com.springBoot.restFulDemo.rest;

import com.springBoot.restFulDemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load student data ... only once!

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Poormina", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){

        return this.theStudents;
    }


    // define endpoint for "/students/{studentId}" - return student at index

//    @GetMapping("/students/{studentId}")
//    public Student getStudent(@PathVariable String studentId){
//        // Generic try-catch exception handling implemented by Course's student
//        int id;
//        try{
//            id = Integer.parseInt(studentId);
//        } catch (Exception e){
//            throw new StudentNotFoundException("Student id invalid - " + studentId);
//        }
//
//        //check the studentId again list size
//        if( (id >= theStudents.size()) || (id<0)){
//            throw new StudentNotFoundException("Student id not found - " + studentId);
//        }
//        return theStudents.get(id);
//    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if ((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }

 }
