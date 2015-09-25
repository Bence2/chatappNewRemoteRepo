package hu.web.message.dao;

import hu.web.message.businessbeans.Message;

import java.util.List;

public interface GetMessagesMapper 
{
	public List<Message> getAllMessages();

}
