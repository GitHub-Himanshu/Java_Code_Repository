package com.practice.restws.appsocialmedia;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.practice.restws.appsocialmedia.model.Message;
import com.practice.restws.appsocialmedia.service.MessageService;

@Path("/messages")
public class Messages {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		MessageService ms=new MessageService();
		return ms.getMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public String getMsgById(@PathParam ("messageId") String messageId)
	{
		System.out.println("Hello WS :"+messageId);
		return messageId;
		
	}

}
