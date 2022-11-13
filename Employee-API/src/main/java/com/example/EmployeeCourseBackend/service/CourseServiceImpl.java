package com.example.EmployeeCourseBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeCourseBackend.model.Course;
import com.example.EmployeeCourseBackend.model.CourseEnrollment;
import com.example.EmployeeCourseBackend.repository.CourseEnrollmentRepository;
import com.example.EmployeeCourseBackend.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courserepo;
	@Autowired
	private CourseEnrollmentRepository courseenrollrepo;
	
	@Override
	public Course saveCourse(Course course) {
		return courserepo.save(course);
	}

	@Override
	public List<Course> getAllCourse() {
		return courserepo.findAll();
	}

	@Override
	public List<CourseEnrollment> getAllEnrolledCourses() {
		
		return courseenrollrepo.findAll();
	}
	
	
	
	
}
