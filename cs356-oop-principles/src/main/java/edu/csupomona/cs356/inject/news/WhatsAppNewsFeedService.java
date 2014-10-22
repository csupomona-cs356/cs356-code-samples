package edu.csupomona.cs356.inject.news;

import java.util.Arrays;
import java.util.List;

public class WhatsAppNewsFeedService implements NewsFeedService {

	public List<String> getNewsFeed() {
		return Arrays.asList(new String[]{"News 1 from TW", "News 2 from TW", "News 3 from TW"});
	}

}
