package com.example.EmployeeCourseBackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeCourseBackend.model.*;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, String> {

    Employee findByEmpId(String empId);
}
