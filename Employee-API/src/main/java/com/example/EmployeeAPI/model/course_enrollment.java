package com.example.EmployeeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course_enrollment {

	@Id
	private int course_id;
	private String course_author;
	private String course_status;
	private boolean course_completion_status;
	private int designation_valid;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_author() {
		return course_author;
	}
	public void setCourse_author(String course_author) {
		this.course_author = course_author;
	}
	public String getCourse_status() {
		return course_status;
	}
	public void setCourse_status(String course_status) {
		this.course_status = course_status;
	}
	public boolean isCourse_completion_status() {
		return course_completion_status;
	}
	public void setCourse_completion_status(boolean course_completion_status) {
		this.course_completion_status = course_completion_status;
	}
	public int getDesignation_valid() {
		return designation_valid;
	}
	public void setDesignation_valid(int designation_valid) {
		this.designation_valid = designation_valid;
	}
	@Override
	public String toString() {
		return "course_enrollment [course_id=" + course_id + ", course_author=" + course_author + ", course_status="
				+ course_status + ", course_completion_status=" + course_completion_status + ", designation_valid="
				+ designation_valid + "]";
	}
	
}
