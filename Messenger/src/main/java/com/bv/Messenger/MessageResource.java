package com.bv.Messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bv.dao.MessageService;
import com.bv.model.Message;

@Path("/messages")
public class MessageResource {

	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/*@Produces(MediaType.APPLICATION_XML)*/
	public List<Message> getMessages()
	{
		return service.getMessage();
	}
	
	@GET
	@Path("/{id}")
	/*@Produces(MediaType.APPLICATION_XML)*/
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("id") Long id)
	{
		return service.getMessage(id);
	}
	
	@DELETE
	@Path("/{id}")
/*	@Produces(MediaType.APPLICATION_XML)*/
	@Produces(MediaType.APPLICATION_JSON)
	public void removeMessage(long id)
	{
		 service.removeMessage(id);
	}
	
	@POST
	/*@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)*/
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return service.addMessage(message);
	}
}

