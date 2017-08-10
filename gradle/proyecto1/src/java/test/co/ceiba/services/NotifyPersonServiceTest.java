package co.ceiba.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.service.EmailService;
import co.ceiba.service.NotifyPersonService;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailservice;
	
   @Before
   public void setup(){
	 
	   emailservice= new EmailService();
	   notifyPersonService= new NotifyPersonService(emailservice);
   }
   
   @Test
   public void notifyTest() {
	   Person person = new PersonTestDataBuilder().build();
	   String message= notifyPersonService.notify(person);
	   Assert.assertNotNull(message);
   }

}
