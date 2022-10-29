/*package com.example.demo.course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;   



	@RestController
	public class CourseController {
	
	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/topic/{id}/courses")
	public List<Course> allcourses() {
		return CourseService.getallCourses();
	}
	
	@RequestMapping("/{topicId}/topic/Course/{Id}")
	public Course getCourse(@PathVariable String id) {
		return CourseService.getCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/{topicId}/topic/Course}")
	public void addCourse(@RequestBody Course course) {
		course.setTopic1(new Course(topicId,"",""));
	CourseService.addCourse(course);	
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateTopic(@RequestBody Course topic,@PathVariable String id) {
	CourseService.updateCourse(id,topic);	
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	public void deleteTopic(@RequestBody Course topic,@PathVariable String id) {
	CourseService.deleteCourse(id,topic);	
}
	/*@RequestMapping("/topic/{designation}")
	public Topic getTopic1(@PathVariable String designation) {
		return topicService.gettopic(designation);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic1(@RequestBody Topic topic) {
	topicService.addTopic(topic);	
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{designation}")
	public void updateTopic1(@RequestBody Topic topic,@PathVariable String designation) {
	topicService.updateTopic(designation,topic);	
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{designation}")
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String designation) {
	topicService.deleteTopic(designation,topic);	
}*/
	
	
	
	
	
	//}
