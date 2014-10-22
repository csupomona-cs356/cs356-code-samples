package edu.csupomona.cs356.inject;

public class TwitterService implements MessageService {
	 
    public boolean sendMessage(String msg, String receipient) {
        // some complex code to send Twitter message
        System.out.println("Message sent to Twitter user " + receipient + " with message=" + msg);
        return true;
    }

}