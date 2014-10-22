package edu.csupomona.cs356.mysocial.messaging;

public class FBMessageService implements MessageService {

	public void sendMessage(String msg) {
		System.out.println("Send messge using FB: " + msg);
	}

}
