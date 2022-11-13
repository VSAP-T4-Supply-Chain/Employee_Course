package com.example.EmployeeCourseBackend.service;

import java.util.List;

import com.example.EmployeeCourseBackend.model.Course;
import com.example.EmployeeCourseBackend.model.CourseEnrollment;

public interface CourseService {
	public Course saveCourse(Course course);
	public List<Course> getAllCourse();
	public List<CourseEnrollment> getAllEnrolledCourses();
}
