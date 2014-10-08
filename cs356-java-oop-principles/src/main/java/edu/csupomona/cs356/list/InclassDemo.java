package edu.csupomona.cs356.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;

public class InclassDemo {

	private List<String> answers;
	
	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public static void main(String[] args) {		
		final PaginatedQueryList<String> list = null;
		final LinkedList<String> answers2 = new LinkedList<String>();
		final ArrayList<String> answers = new ArrayList<String>();		
		//answers2 = new LinkedList<String>();
		
		InclassDemo demo = new InclassDemo();		
		demo.setAnswers(answers);
		demo.setAnswers(list);
	}
}