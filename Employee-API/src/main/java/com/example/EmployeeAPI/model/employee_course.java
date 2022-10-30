package com.example.EmployeeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee_course {
	
	@Id
	private int emp_cour_id;
	private String course_completion_status;
	private String course_description;
	private String course_name;
	private String course_validity;
	private int course_id;
	public int getEmp_cour_id() {
		return emp_cour_id;
	}
	public void setEmp_cour_id(int emp_cour_id) {
		this.emp_cour_id = emp_cour_id;
	}
	public String getCourse_completion_status() {
		return course_completion_status;
	}
	public void setCourse_completion_status(String course_completion_status) {
		this.course_completion_status = course_completion_status;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_validity() {
		return course_validity;
	}
	public void setCourse_validity(String course_validity) {
		this.course_validity = course_validity;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "employee_course [emp_cour_id=" + emp_cour_id + ", course_completion_status=" + course_completion_status
				+ ", course_description=" + course_description + ", course_name=" + course_name + ", course_validity="
				+ course_validity + ", course_id=" + course_id + "]";
	}
	
}
