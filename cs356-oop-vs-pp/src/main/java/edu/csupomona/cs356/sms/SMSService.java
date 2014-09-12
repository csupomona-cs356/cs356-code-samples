package edu.csupomona.cs356.sms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SMSService {

	private String inputBuffer;
	private List<String> messageQueue;
	private List<String> displayBuffer;
	
	public SMSService() {
		messageQueue = new LinkedList<String>();
		displayBuffer = new LinkedList<String>();
	}
	
	public void inputMessage() {
		// open the keyboard
		// let users to type the strings
		Scanner s = new Scanner(System.in);
		inputBuffer = s.nextLine();
		s.close();
	}
	
	public void sendMessage() {
		// send the message stored in 
		System.out.println("Message " + inputBuffer + " is sent successfully.");
	}
	
	public void receiveMessage(String message) {
		String messageRvd = message;
		
		// add the message to the queue
		messageQueue.add(messageRvd);
		displayBuffer.add(messageRvd);
	}
	
	public void displayMessages() {
		for(String str : displayBuffer) {
			System.out.println("Display the message: " + str);
		}
	}
		
}
