package edu.csupomona.cs356.inject;

public class FacebookService implements MessageService {
	 
    public boolean sendMessage(String msg, String receipient) {
        // some complex code to send Facebook message
        System.out.println("Message sent to Facebook user " + receipient + " with message=" + msg);
        return true;
    }

}