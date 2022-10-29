package com.example.demo.employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;   



	@RestController
	public class EmployeeController {
	
	@Autowired
	private EmployeeService EmployeeService;
	
	@RequestMapping("/topic")
	public List<Employee> alltopics() {
		return EmployeeService.getalltopics();
	}
	
	

	@RequestMapping("/topic/{designation}")
	public Employee getTopic(@PathVariable String designation) {
		return EmployeeService.gettopic(designation);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Employee topic) {
	EmployeeService.addTopic(topic);	
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{designation}")
	public void updateTopic(@RequestBody Employee topic,@PathVariable String designation) {
	EmployeeService.updateTopic(designation,topic);	
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{designation}")
	public void deleteTopic(@RequestBody Employee topic,@PathVariable String designation) {
	EmployeeService.deleteTopic(designation,topic);	
}
	
	}
