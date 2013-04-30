package com.example.foundationsofsuccessfulprogramminginjava;

public class Question {

	String question;
	int id;
	String[] answers = new String[4];
	int correct;
	
	public Question(int id, String question, String a1, String a2, String a3, String a4, int correct){
		this.question = question;
		this.id = id;
		answers[0] = a1;
		answers[1] = a2;
		answers[2] = a3;
		answers[3] = a4;
		this.correct = correct;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Question){
			if(((Question) other).id == this.id){
				return true;
			}
		}
		return false;
	}
}
