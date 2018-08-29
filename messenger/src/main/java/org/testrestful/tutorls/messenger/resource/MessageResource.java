package org.testrestful.tutorls.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.testrestful.tutorls.messenger.model.Message;
import org.testrestful.tutorls.messenger.service.MessangerService;

@Path("/messages")
public class MessageResource {
	
	MessangerService service=new  MessangerService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return service.getMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMsgById(@PathParam("messageId") String messageId)
	{
		System.out.println("Message id is : "+messageId);
		return service.getMsgById(messageId);
	}
}
