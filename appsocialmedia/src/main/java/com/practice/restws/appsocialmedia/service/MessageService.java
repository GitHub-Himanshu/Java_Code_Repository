package com.practice.restws.appsocialmedia.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.restws.appsocialmedia.model.Message;


public class MessageService {
	
	
	public List<Message> getMessages()
	{	
		Message m1=new Message("1", "himanshu", new Date());
		Message m2=new Message("2", "gunjan", new Date());
		List<Message> lst=new ArrayList<>();
		lst.add(m1);
		lst.add(m2);	
		return lst;
	}
	
	public void addMessage(Message m)
	{
		List<Message> lstNew=new ArrayList<>();
		lstNew.add(m);
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
