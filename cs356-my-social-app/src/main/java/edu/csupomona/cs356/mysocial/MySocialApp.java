package edu.csupomona.cs356.mysocial;

import com.google.inject.Inject;

import edu.csupomona.cs356.mysocial.messaging.MessageService;
import edu.csupomona.cs356.mysocial.newsfeed.NewsFeedService;

public class MySocialApp {

	private MessageService messageService;
	private NewsFeedService newsFeedService;

	@Inject
	public MySocialApp(MessageService messageService,
			NewsFeedService newsFeedService) {
		this.messageService = messageService;
		this.newsFeedService = newsFeedService;
	}
	
	public void sendMyMessage(String msg) {
		messageService.sendMessage(msg);
	}
	
	public void displayNewsFeed() {
		System.out.println(newsFeedService.getNewsFeed());
	}
}
