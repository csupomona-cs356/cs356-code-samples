package edu.csupomona.cs356.inject.news;

import java.util.Arrays;
import java.util.List;

public class FacebookNewsFeedService implements NewsFeedService {

	public List<String> getNewsFeed() {
		return Arrays.asList(new String[]{"News 1 from FB", "News 2 from FB", "News 3 from FB"});
	}

}
