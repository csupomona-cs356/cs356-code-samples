package edu.csupomona.cs356.inject.app;

import com.google.inject.Inject;

import edu.csupomona.cs356.inject.MessageService;
import edu.csupomona.cs356.inject.news.NewsFeedService;

public class MySocialApplication {

	private MessageService messageService;
	private NewsFeedService newsFeedService;

	@Inject
	public MySocialApplication(MessageService messageService, NewsFeedService newsFeedService){
		this.messageService = messageService;
		this.newsFeedService = newsFeedService;
	}	

	public boolean sendMessage(String msg, String rec) {
		// some business logic here
		return messageService.sendMessage(msg, rec);
	}
	
	public void displayNewsFeed() {
		System.out.println("News Feed");
		System.out.println(newsFeedService.getNewsFeed());
	}
}
