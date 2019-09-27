package com.bv.database;

import java.util.HashMap;
import java.util.Map;

import com.bv.model.Message;

public class DatabaseClass {

	public static Map<Long , Message> messages = new HashMap<>();
	
	public static Map<Long , Message> getMessages()
	{
		return messages;
	}
}