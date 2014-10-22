package edu.csupomona.cs356.inject.news;

import java.util.Arrays;
import java.util.List;

public class TwitterNewsFeedService implements NewsFeedService {

	public List<String> getNewsFeed() {
		return Arrays.asList(new String[]{"News 1 from WA", "News 2 from WA", "News 3 from WA"});
	}

}
