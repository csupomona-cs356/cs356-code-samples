package edu.csupomona.cs356.mysocial;

import com.google.inject.AbstractModule;

import edu.csupomona.cs356.mysocial.messaging.FBMessageService;
import edu.csupomona.cs356.mysocial.messaging.MessageService;
import edu.csupomona.cs356.mysocial.newsfeed.NewsFeedService;
import edu.csupomona.cs356.mysocial.newsfeed.TWNewsFeedService;

public class MySocialAppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(FBMessageService.class);
		bind(NewsFeedService.class).to(TWNewsFeedService.class);
	}

}
