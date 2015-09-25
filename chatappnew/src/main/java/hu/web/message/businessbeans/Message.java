package hu.web.message.businessbeans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message
{
	private Integer id;
	private String sendersName;
//	private int sendersAge;
	private String message;
	
	Date date= new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private String dateOfMessage;
	{
		dateOfMessage = sdf.format(date);
	}

	public String getSendersName()
	{
		return sendersName;
	}

	public void setSendersName(String senderName)
	{
		this.sendersName = senderName;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getDateOfMessage()
	{
		return dateOfMessage;
	}

	public void setDateOfMessage(String dateOfMessage)
	{
		this.dateOfMessage = dateOfMessage;
	}

	private Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}
	
//	public int getSendersAge()
//	{
//		return sendersAge;
//	}
//
//	public void setSendersAge(int sendersAge)
//	{
//		this.sendersAge = sendersAge;
//	}


}
