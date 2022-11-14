package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "course")
@Entity
public class Course {
    
	public Course() {
		
	}
	public Course(String courseId, String courseName, String content) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.content = content;
	}

    @Id
	private String courseId;
	private String courseName;
	private String content;

    public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getContent() {
		return content;
	}
	public void setQuantity(String content) {
		this.content = content;
	}
}
