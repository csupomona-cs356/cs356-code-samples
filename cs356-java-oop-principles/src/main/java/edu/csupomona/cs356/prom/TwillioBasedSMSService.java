package edu.csupomona.cs356.prom;

public class TwillioBasedSMSService implements ISMSService {

	// private ....
	
	public void sendMessage(String msg) {
		System.out.println("TEST send");
	}
	
	public void receiveMessage(String msg) {
		System.out.println("Rev");
	}
}
