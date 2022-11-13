package com.example.EmployeeCourseBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeCourseBackend.model.Course;
import com.example.EmployeeCourseBackend.model.CourseEnrollment;
import com.example.EmployeeCourseBackend.service.CourseService;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {

	@Autowired
	private CourseService courseservice;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Course course) {
		courseservice.saveCourse(course);
		return "New Course Updated";
	}
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourse(){
		return courseservice.getAllCourse();
	}
	
	@GetMapping("/getAllRegistered")
	public List<CourseEnrollment> getAllRegisteredCourses(){
		return courseservice.getAllEnrolledCourses();
	}
}
