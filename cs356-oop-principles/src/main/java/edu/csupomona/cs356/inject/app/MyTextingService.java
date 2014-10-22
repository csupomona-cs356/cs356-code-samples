package edu.csupomona.cs356.inject.app;

import com.google.inject.Inject;

import edu.csupomona.cs356.inject.MessageService;

public class MyTextingService {

	private MessageService service;

	@Inject
	public MyTextingService(MessageService service) {
		super();
		this.service = service;
	}
	
	
}
