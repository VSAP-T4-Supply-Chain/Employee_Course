package com.example.EmployeeCourseBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeCourseBackend.model.*;

@Repository
public interface CourseRepository  extends JpaRepository<Course, String> {

    Course findByCourseId(String courseId);
}
