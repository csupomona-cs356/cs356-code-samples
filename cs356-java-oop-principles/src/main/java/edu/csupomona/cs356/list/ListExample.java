package edu.csupomona.cs356.list;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;

public class ListExample {

	private List<String> webpageUrls;

	public List<String> getWebpageUrls() {
		return webpageUrls;
	}

	public void setWebpageUrls(List<String> webpageUrls) {
		this.webpageUrls = webpageUrls;
	}
	
	public static void main(String[] args) {
		ArrayList<String> res = new ArrayList<String>();
		PaginatedQueryList<String> res2 = null;
		
		ListExample example = new ListExample();
		example.setWebpageUrls(res);
		example.setWebpageUrls(res2);
	}
}
