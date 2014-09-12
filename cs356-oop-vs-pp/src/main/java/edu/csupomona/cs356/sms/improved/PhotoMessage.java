package edu.csupomona.cs356.sms.improved;

import java.awt.Image;

public class PhotoMessage implements Message {

	private Image image;
	
	public void displayMessage() {
		System.out.println("Display IMAGE: " + image);
	}

	public void getInputMessage() {
		image = null; // some photo file	
		System.out.println("Get a photo from somewhere");
	}

}
