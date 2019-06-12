package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

private List<Topic> l= new ArrayList<>(Arrays.asList(new Topic("a"),
			new Topic("b"),
			new Topic("c")));
public List<Topic> getTopics()
{
	return l;
}
public Topic getTopicById(String id) 
{
	return l.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}
public void addTopic(Topic topic) {
	// TODO Auto-generated method stub
	l.add(topic);
	
}
public void updateTopic(Topic topic, String id) {
	// TODO Auto-generated method stub
	for(int i=0;i<l.size();i++)
	{
		if(l.get(i).getId().equals(id))
			l.set(i,topic);
	}
	
}
public void deleteId(String id) {
	// TODO Auto-generated method stub
	l.removeIf(t -> t.getId().equals(id));
	
}
}
