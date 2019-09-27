package com.bv.dao;
import java.util.List;

import com.bv.model.Message;

public interface MessageDao {

	public List<Message> getMessage();
	
	public Message addMessage(Message message);
	
	public Message getMessage(long id);
	
	public Message updateMessage(Message message);
	
	public void removeMessage(long id);
	
}

