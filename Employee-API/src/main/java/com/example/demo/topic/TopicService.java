/*package com.example.demo.topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

//import com.example.demo.designation.Topic;

@Service
public class TopicService {

	private List<Topic> topic=new ArrayList<>(Arrays.asList(
			new Topic("654321","Varsha","varsha34@gmail.com","Software Engineer","Java","python","C"),
			new Topic("654322","Shanmukh","shanmukh27@gmail.com","Architect","Achitectural Technology","urban planning","Architectural design"),
			new Topic("654323","Varsha","varsha23@gmail.com","Marketing","Content Marketing","SEO Marketing","Social Media Marketing"),
			new Topic("654324","Keerthi","keerthi12@gmail.com","Data Analyst","MySQL","SAS","R")
			));

public List<Topic> getalltopics(){
	return topic;
}


public Topic gettopic(String id) {
	return topic.stream().filter (t -> t.getId().equals(id)).findFirst().get();
}

public void addTopic(Topic topic2) {
	topic.add(topic2);
	
}


public void updateTopic(String id, Topic topic2) {
	for(int i=0;i<topic.size();i++) {
		Topic t= topic.get(i);
		if(t.getId().equals(id)) {
			topic.set(i,topic2);
			return;
		}
	}
	
}
public void deleteTopic(String id, Topic topic2) {
	topic.removeIf(t->t.getId().equals(id));

	
}
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