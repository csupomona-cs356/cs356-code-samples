package edu.csupomona.cs356.inject.app;

import com.google.inject.AbstractModule;

import edu.csupomona.cs356.inject.FacebookService;
import edu.csupomona.cs356.inject.MessageService;
import edu.csupomona.cs356.inject.news.NewsFeedService;
import edu.csupomona.cs356.inject.news.TwitterNewsFeedService;

public class MySocialAppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(FacebookService.class);
		bind(NewsFeedService.class).to(TwitterNewsFeedService.class);		
	}
}
