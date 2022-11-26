package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.example.demo.model.*;

public interface CourseDesignationRepository extends JpaRepository<CourseDesignation, String> {
    
    public List<Course> findByCourseId(String courseId);
    
    public List<CourseDesignation> findAllCourseIdByDesignationLevel(int designationLevel);
}
