package com.bv.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bv.database.DatabaseClass;
import com.bv.model.Message;

public class MessageService implements MessageDao {

	private static Map<Long , Message> messages = DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(101L , new Message(101 , "Hello Jersey" ,new Date() ,"Java"));
		messages.put(102L , new Message(102 , "Hello London" , new Date(),"JavaScript"));
	}
	
	@Override
	public List<Message> getMessage() {
		
		return new ArrayList<Message>(messages.values());
	}

	@Override
	public Message addMessage(Message message) {
		
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	@Override
	public Message getMessage(long id) {
		
		return messages.get(id);
	}

	@Override
	public Message updateMessage(Message message) {

        if(message.getId()<=0)
        {
        	return null;
        }
        messages.put(message.getId(), message);
        return message;
	}


	@Override
	public void removeMessage(long id) {
		messages.remove(id);
		
	}

	
}
