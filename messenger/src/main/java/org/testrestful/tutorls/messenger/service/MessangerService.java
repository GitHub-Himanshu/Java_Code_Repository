package org.testrestful.tutorls.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testrestful.tutorls.messenger.model.Message;

public class MessangerService {
	
	
	public List<Message> getMessages()
	{	
		Message m1=new Message("1", "himanshu", new Date());
		Message m2=new Message("2", "gunjan", new Date());
		List<Message> lst=new ArrayList<>();
		lst.add(m1);
		lst.add(m2);	
		return lst;
	}
	
	public Message getMsgById(String messageId)
	{
		Message m1=new Message("1", "himanshu", new Date());
		Message m2=new Message("2", "gunjan", new Date());
		Map<String, Message> map=new  HashMap<>();
		map.put("1", m1);
		map.put("2", m2);
		return map.get(messageId);
		
	}
}
