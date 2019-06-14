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

import javax.smartcardio.Card;

@RestController
@CrossOrigin
public class TopicController {
	
	@Autowired
	private TopicService ts;
	private int count = 0;
	
	@RequestMapping("/topics")
	public Object returnTopics()
	{
		Cards cards = new Cards();
		CardObjImpl card = new CardObjImpl();
		card.setSize(6);
		card.setCardName("Schools");
		card.setCardValue("Number of Schools: 32423");
		rowData row = new rowData();
		ThumbnailObjImpl thumbnail = new ThumbnailObjImpl();
		thumbnail.setNameOfThumbnail("Funding Type");
		ThumbnailData data = new ThumbnailData();
		data.setType("%");
		data.setValue(60.0);
		data.setFooter("Govt. Aided");
		thumbnail.insertThumbnailData(data);
		ThumbnailData data1 = new ThumbnailData();
		data1.setType("%");
		data1.setValue(20.0);
		data1.setFooter("Private");
		thumbnail.insertThumbnailData(data1);
		ThumbnailData data2 = new ThumbnailData();
		data2.setType("%");
		data2.setValue(10.9);
		data2.setFooter("Unrecognized");
		thumbnail.insertThumbnailData(data2);
		row.insertThumbnail(thumbnail);

		ThumbnailObjImpl thumbnail2 = new ThumbnailObjImpl();
		thumbnail2.setNameOfThumbnail("Education Type");
		ThumbnailData data3 = new ThumbnailData();
		data3.setType("%");
		data3.setValue(10.0);
		data3.setFooter("Primary");
		thumbnail2.insertThumbnailData(data3);
		ThumbnailData data4 = new ThumbnailData();
		data4.setType("%");
		data4.setValue(60.0);
		data4.setFooter("Upper Primary");
		thumbnail2.insertThumbnailData(data4);
		ThumbnailData data5 = new ThumbnailData();
		data5.setType("%");
		data5.setValue(30);
		data5.setFooter("High Schools");
		thumbnail2.insertThumbnailData(data5);
		row.insertThumbnail(thumbnail2);
		card.insertRowData(row);


		rowData row2 = new rowData();
		ThumbnailObjImpl thumbnail3 = new ThumbnailObjImpl();
		thumbnail3.setNameOfThumbnail("Drop Out");
		ThumbnailData data6 = new ThumbnailData();
		data6.setType("%");
		data6.setValue(67.0);
		data6.setFooter("");
		thumbnail3.insertThumbnailData(data6);
		row2.insertThumbnail(thumbnail3);

		ThumbnailObjImpl thumbnail4 = new ThumbnailObjImpl();
		thumbnail4.setNameOfThumbnail("Kitchen Garden");
		ThumbnailData data7 = new ThumbnailData();
		data7.setType("");
		data7.setValue(365);
		data7.setFooter("");
		thumbnail4.insertThumbnailData(data7);
		row2.insertThumbnail(thumbnail4);

		ThumbnailObjImpl thumbnail5 = new ThumbnailObjImpl();
		thumbnail5.setNameOfThumbnail("Bio Fencing");
		ThumbnailData data8 = new ThumbnailData();
		data8.setType("");
		data8.setValue(478);
		data8.setFooter("");
		thumbnail5.insertThumbnailData(data8);
		row2.insertThumbnail(thumbnail5);


		ThumbnailObjImpl thumbnail6 = new ThumbnailObjImpl();
		thumbnail6.setNameOfThumbnail("Community Mobilization");
		ThumbnailData data9 = new ThumbnailData();
		data9.setType("");
		data9.setValue(654);
		data9.setFooter("");
		thumbnail6.insertThumbnailData(data9);
		row2.insertThumbnail(thumbnail6);


		card.insertRowData(row2);
		card.insertRowData(row);
		cards.insertCard(card);
		cards.insertCard(card);
		CardObjImpl card2 = new CardObjImpl();
		card2.setSize(12);
		card2.setCardName("Schools Infrastructure - Movable");
		card2.setCardValue("");
		card2.setImageUrl("mdi mdi-bookmark-remove");
		card2.insertRowData(row2);
		cards.insertCard(card2);





		return cards;









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
