package edu.csupomona.cs356.mysocial.messaging;

public class TWMessageService implements MessageService {

	public void sendMessage(String msg) {
		System.out.println("Send messge using TW: " + msg);
	}

}
