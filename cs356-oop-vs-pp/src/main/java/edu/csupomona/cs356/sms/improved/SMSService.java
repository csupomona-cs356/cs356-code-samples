package edu.csupomona.cs356.sms.improved;

import java.util.LinkedList;
import java.util.List;

public class SMSService {

	private List<Message> messageQueue;
	private List<Message> displayBuffer;
	
	public SMSService() {
		messageQueue = new LinkedList<Message>();
		displayBuffer = new LinkedList<Message>();
	}
	
	public void sendMessage(Message message) {
		// send the message stored in 
		System.out.println("Message " + message + " is sent successfully.");
	}
	
	public void receiveMessage(Message message) {
		Message messageRvd = message;
		// receive the message from the network
		// ...
		
		// add the message to the queue
		messageQueue.add(messageRvd);
		displayBuffer.add(messageRvd);
		if (displayBuffer.size() > 10) {
			displayBuffer.remove(0);
		}
	}
	
	public void displayMessages() {
		for(Message str : displayBuffer) {
			str.displayMessage();
		}
	}
	
}
