package com.example.foundationsofsuccessfulprogramminginjava;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StatisticsPage extends Activity{
	
	private int numUnanswered = 0;
	private int numCorrect = 0;
	private int numIncorrect = 0;
	private int[] answers;
	private int[] responses;
	private float[] data = new float[3];
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.statistics);
		
		getAnswers();
		getResponses();
		
		for(int i = 0; i < answers.length; i++){
			if(responses[i] == -1){
				numUnanswered++;
			}else if(responses[i] == answers[i]){
				numCorrect++;
			}else
				numIncorrect++;
		}
		
		data[0] = (float)numUnanswered;
		data[1] = (float)numCorrect;
		data[2] = (float)numIncorrect;
		
		TextView correct = (TextView)findViewById(R.id.textNumCorrect);
		correct.setText(String.valueOf(numCorrect));
		TextView incorrect = (TextView)findViewById(R.id.textNumIncorrect);
		incorrect.setText(String.valueOf(numIncorrect));
		TextView unanswered = (TextView)findViewById(R.id.textNumUnanswered);
		unanswered.setText(String.valueOf(numUnanswered));

	}
	
	public void getAnswers(){
		answers = getIntent().getIntArrayExtra("answers");
	}
	
	public void getResponses(){
		responses = getIntent().getIntArrayExtra("responses");
	}
}
