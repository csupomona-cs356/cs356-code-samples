package edu.csupomona.cs356.sms;

public class SMSServiceTest {

	public static void main(String[] args) {
		SMSService service = new SMSService();
		service.inputMessage();
		service.sendMessage();	

		service.receiveMessage("Test");
		service.displayMessages();
	}

}
