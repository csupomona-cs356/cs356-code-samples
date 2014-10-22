package edu.csupomona.cs356.inject;

public class WhatsAppService implements MessageService {
	 
    public boolean sendMessage(String msg, String receipient) {
        // some complex code to send What's App message
        System.out.println("Message sent to What's App user " + receipient + " with message=" + msg);
        return true;
    }

}