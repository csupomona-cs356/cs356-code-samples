package edu.csupomona.cs356.sms.improved;

public class SMSServiceTest {

	public static void main(String[] args) {
		SMSService service = new SMSService();
		
		Message m1 = new TextMessage();
		Message m2 = new PhotoMessage();
		
		m1.getInputMessage();
		service.sendMessage(m1);
		
		m2.getInputMessage();
		service.sendMessage(m2);
		
		
		SMSService service2 = new SMSService();
		service2.receiveMessage(m1);
		service2.receiveMessage(m2);
		service2.displayMessages();
	}

}
