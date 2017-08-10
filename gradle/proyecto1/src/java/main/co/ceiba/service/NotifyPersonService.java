package co.ceiba.service;

import co.ceiba.domain.Person;

public class NotifyPersonService {
	
	private EmailService emailservice;
	
	public NotifyPersonService(EmailService emailservices)
	{
	   this.emailservice=	emailservices;
	}
	
	public String  notify(Person person)
	{
		String message= "Welcome" + person.getName();
		return emailservice.sendMail(message);
	}

}
