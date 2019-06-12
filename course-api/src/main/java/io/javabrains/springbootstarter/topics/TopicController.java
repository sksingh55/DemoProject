package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.*;

import io.javabrains.springbootstarter.hello.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
@CrossOrigin
public class TopicController {
	
	@Autowired
	private TopicService ts;
	private int count = 0;
	
	@RequestMapping("/topics")
	public Object returnTopics()
	{
		CardObjImpl temp = new CardObjImpl();
		temp.setCardName("School Category");
		temp.setCardValue("Total # of Schools: 32423");

		ThumbnailObjImpl t = new ThumbnailObjImpl();
		t.setNameOfThumbnail("Funding Type");
		Map<String,Map<Integer,String>> a = new HashMap<>();
		Map<Integer,String> b = new HashMap<>();
		b.put(60,"%");
		a.put("Govt",b);
		t.setTypeValueMap(a);
		List<ThumbnailObjImpl> xyz = new ArrayList<>();
		xyz.add(t);
		temp.setThubmnailList(xyz);
		System.out.println(temp);

		return temp;
	}
	@RequestMapping("/topicid")
	public Object returnThumbnail()
	{
		System.out.println(count);
		count = count+1;
		count = count%10;
		List<Double> l = new ArrayList<>();
		l.add((50.0-count*5));
		l.add(12.5);
		l.add(20.5);
		l.add(15.0);
		l.add((2.0+count*5));
		Graph g = new Graph();
		g.setData(l);
		return g;
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		ts.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		ts.updateTopic(topic,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topicid/{id}")
	public void deleteId(@PathVariable String id)
	{
		 ts.deleteId(id);
	}

}
