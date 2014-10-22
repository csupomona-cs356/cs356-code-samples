package edu.csupomona.cs356.mysocial.messaging;

public class GPMessageService implements MessageService {

	public void sendMessage(String msg) {
		System.out.println("Send messge using GP: " + msg);
	}

}
