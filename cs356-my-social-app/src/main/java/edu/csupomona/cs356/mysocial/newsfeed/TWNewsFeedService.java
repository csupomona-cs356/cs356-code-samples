package edu.csupomona.cs356.mysocial.newsfeed;

import java.util.Arrays;
import java.util.List;

public class TWNewsFeedService implements NewsFeedService {

	public List<String> getNewsFeed() {
		
		return Arrays.asList(new String[]{"f1 TW", "f2 TW", "f3 TW"});
	}

}
