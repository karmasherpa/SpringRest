package com.springrest.service;

import com.springrest.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService{
    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145, "java course", "this is java course"));
        list.add(new Course(987, "python course", "this is python course"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
