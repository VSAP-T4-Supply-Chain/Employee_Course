package com.example.EmployeeAPI.employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {

	private List<Employee> topic=new ArrayList<>(Arrays.asList(
			new Employee("Software Engineer","Java","python","C"),
			new Employee("Architect","Achitectural Technology","urban planning","Architectural design"),
			new Employee("Marketing","Content Marketing","SEO Marketing","Social Media Marketing"),
			new Employee("Data Analyst","MySQL","SAS","R")
			));

public List<Employee> getalltopics(){
	return topic;
}


public Employee gettopic(String designation) {
	return topic.stream().filter (t -> t.getDesignation().equals(designation)).findFirst().get();
}


public void addTopic(Employee topic2) {
	topic.add(topic2);
	
}


public void updateTopic(String designation, Employee topic2) {
	for(int i=0;i<topic.size();i++) {
		Employee t= topic.get(i);
		if(t.getDesignation().equals(designation)) {
			topic.set(i,topic2);
			return;
		}
	}
	
}
public void deleteTopic(String designation, Employee topic2) {
	topic.removeIf(t->t.getDesignation().equals(designation));

	
}


}