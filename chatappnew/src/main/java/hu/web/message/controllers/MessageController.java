package hu.web.message.controllers;


import hu.web.message.businessbeans.Message;
import hu.web.message.dao.GetMessagesMapper;
import hu.web.message.service.GetMessagesService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	
	@Autowired
	private GetMessagesMapper getMessagesDAO;
	
	@RequestMapping(value = "/getmessages", method = RequestMethod.GET)
	public @ResponseBody List<Message> messageHandler()
	{
		
		return getMessagesDAO.getAllMessages();
//		List<Message> messages = new ArrayList<Message>();
//		Message message = new Message();
//		{
//			message.setMessage("üzenet");
//			message.setSendersName("Bencőke");
//		}
//		messages.add(message);
//
//		return messages;

	}
}
