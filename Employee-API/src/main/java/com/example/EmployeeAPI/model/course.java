package com.example.EmployeeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course {

	@Id
	private int course_id;
	private String course_name;
	private String course_content;
	private String course_description;
	private String mentor_name;
	private String role_suitable;
	private int employe_id;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_content() {
		return course_content;
	}
	public void setCourse_content(String course_content) {
		this.course_content = course_content;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getMentor_name() {
		return mentor_name;
	}
	public void setMentor_name(String mentor_name) {
		this.mentor_name = mentor_name;
	}
	public String getRole_suitable() {
		return role_suitable;
	}
	public void setRole_suitable(String role_suitable) {
		this.role_suitable = role_suitable;
	}
	public int getEmploye_id() {
		return employe_id;
	}
	public void setEmploye_id(int employe_id) {
		this.employe_id = employe_id;
	}
	@Override
	public String toString() {
		return "course [course_id=" + course_id + ", course_name=" + course_name + ", course_content=" + course_content
				+ ", course_description=" + course_description + ", mentor_name=" + mentor_name + ", role_suitable="
				+ role_suitable + ", employe_id=" + employe_id + "]";
	}
	
}
