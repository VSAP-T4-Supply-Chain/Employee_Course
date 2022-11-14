package com.example.demo.controller;

import java.util.List;

import com.example.demo.service.CourseDesignationService;
import com.example.demo.service.CourseService;
import com.example.demo.model.Course;
import com.example.demo.model.CourseDesignation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDesignationController {
	
	@Autowired
	private CourseDesignationService courseDesignationService;
    
	
	
    @RequestMapping("/{level}/availableCourse")
	public List<Course> getAllCourse(@PathVariable int level) {
		return courseDesignationService.getAllCoursesByDes(level);
	}
	@RequestMapping("/{empId}/availableCourses")
	public List<Course> getAvailableCoursesForEmp(@PathVariable String empId) {
		return courseDesignationService.getAvaialbleCoursesForEmp(empId);
	}

}
