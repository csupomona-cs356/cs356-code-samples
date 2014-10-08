package edu.csupomona.cs356.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;

public class DemoList {

	private List<String> answers; 
	
	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}	

	public static void main(String[] args) {
		ArrayList<String> answers = new ArrayList<String>();
		
		LinkedList<String> answers2 = new LinkedList<String>();
		PaginatedQueryList<String> answers3 = null; // get sth from the db
		
		DemoList demo = new DemoList();
		demo.setAnswers(answers);
		demo.setAnswers(answers2);
		demo.setAnswers(answers3);
		
	}




}
