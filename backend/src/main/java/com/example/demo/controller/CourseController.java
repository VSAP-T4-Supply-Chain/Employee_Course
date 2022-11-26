package com.example.demo.controller;

import java.util.List;

import com.example.demo.service.CourseService;
import com.example.demo.model.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/admin/allCourses")
	public List<Course> getAllCourse() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/admin/course/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/admin/addCourse")
	public void productSave(@RequestBody Course productmodel) {
		courseService.addCourse(productmodel);
		
	}
	@RequestMapping(method = RequestMethod.POST,value="/admin/productEdit/{id}")
	public void productEditSave(@RequestBody Course productmodel,@PathVariable String id ) {
		courseService.updateCourse(productmodel,id);
	}
	
	@RequestMapping(method= RequestMethod.DELETE,value="/admin/delete/{id}")
	public void productDelete(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
