package edu.csupomona.cs356.mysocial.newsfeed;

import java.util.Arrays;
import java.util.List;

public class FBNewsFeedService implements NewsFeedService {

	public List<String> getNewsFeed() {
		
		return Arrays.asList(new String[]{"f1 FB", "f2 FB", "f3 FB"});
	}

}
