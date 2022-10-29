/*package com.example.demo.course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.designation.Topic;

@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepository courseRepository;

	/*private List<Course> topic=new ArrayList<>(Arrays.asList(
			new Course("654321","Varsha","varsha34@gmail.com","Software Engineer","Java","python","C"),
			new Course("654322","Shanmukh","shanmukh27@gmail.com","Architect","Achitectural Technology","urban planning","Architectural design"),
			new Course("654323","Varsha","varsha23@gmail.com","Marketing","Content Marketing","SEO Marketing","Social Media Marketing"),
			new Course("654324","Keerthi","keerthi12@gmail.com","Data Analyst","MySQL","SAS","R")
			));*/

/*public List<Course> getallCourses(){
	List<Course>courses =new ArrayList<>();
	courseRepository.findAll()
	.forEach(courses::add);
	return courses;
}


public Course getCourse(String id) {
	return courseRepository.findOne(id);
}

public void addCourse(Course course) {
	courseRepository.save(course);
	
}


public void updateCourse(String id, Course course) {
	courseRepository.save(course);
	
}
public void deleteCourse(String id, Course course) {
	courseRepository.delete(id);

	
}*/
/*public Topic gettopic1(String designation) {
	return topic.stream().filter (t -> t.getDesignation().equals(designation)).findFirst().get();
}


public void addTopic1(Topic topic2) {
	topic.add(topic2);
	
}


public void updateTopic1(String designation, Topic topic2) {
	for(int i=0;i<topic.size();i++) {
		Topic t= topic.get(i);
		if(t.getId().equals(designation)) {
			topic.set(i,topic2);
			return;
		}
	}
	
}


public void deleteTopic(String designation, Topic topic2) {
	topic.removeIf(t->t.getDesignation().equals(designation));
	
}*/

//}