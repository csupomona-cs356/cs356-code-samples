package edu.csupomona.cs356.sms.improved;

import java.util.Scanner;

public class TextMessage implements Message {

	private String text;
	
	public void displayMessage() {
		System.out.println("Display TEXT: " + text);
	}

	public void getInputMessage() {
		Scanner s = new Scanner(System.in);
		text = s.nextLine();
		s.close();
	}

}
