package hu.web.message.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hu.web.message.businessbeans.Message;

public class GetMessagesDAOImpl {
	
	@Autowired
	private GetMessagesMapper getMessagesDAO;
	
	public List<Message> getAllMessages() {
		return this.getMessagesDAO.getAllMessages();
	}

}
