package com.example.EmployeeCourseBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeCourseBackend.model.*;

import java.util.*;

@Repository
public interface CourseEnrollmentRepository  extends JpaRepository<CourseEnrollment, String> {
    
    public List<Course> findAllCourseByEmpId(String empId);
    Course findByCourseId(String courseId);
}