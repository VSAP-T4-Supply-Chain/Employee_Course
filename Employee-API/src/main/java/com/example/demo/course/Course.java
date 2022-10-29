/*package com.example.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.demo.topic.Topic;

//member variables

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String designation;
	private String course1;
	private String course2;
	private String course3;
	
	//constructors
	
	
	private Topic topic;
	
	

	public Course() {
		
		
	}
	public Course(String id, String name, String email,String designation,String course1,String course2,String course3,String topicId ) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.topic=new Topic(topicId,"","", topicId, topicId, topicId, topicId);
	}
	public Topic getTopic1() {
		return topic;
	}
	public void setTopic1(Course course) {
		this.topic = course;
	}
	
	//get and set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCourse1() {
		return course1;
	}
	public void setCourse1(String course1) {
		this.course1 = course1;
	}
	public String getCourse2() {
		return course2;
	}
	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	public String getCourse3() {
		return course3;
	}
	public void setCourse3(String course3) {
		this.course3 = course3;
	}
	
	
}*/





	 
