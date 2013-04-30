package com.example.foundationsofsuccessfulprogramminginjava;

public class Question {

	String question;
	String[] answers = new String[4];
	int correct;
	
	public Question(String question, String a1, String a2, String a3, String a4, int correct){
		this.question = question;
		answers[0] = a1;
		answers[1] = a2;
		answers[2] = a3;
		answers[3] = a4;
		this.correct = correct;
	}
}
