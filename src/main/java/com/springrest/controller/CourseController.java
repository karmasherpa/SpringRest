package com.springrest.controller;

import com.springrest.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }

    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){

        return null;
    }
}
