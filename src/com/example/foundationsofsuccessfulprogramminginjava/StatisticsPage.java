package com.example.foundationsofsuccessfulprogramminginjava;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class StatisticsPage extends Activity{
	
	private int numUnanswered = 0;
	private int numCorrect = 0;
	private int numIncorrect = 0;
	private int[] answers;
	private int[] responses;
	private float[] data;
	private RadioGroup rGroup;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.question);
		
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
		
		rGroup = (RadioGroup)findViewById(R.id.radioGroup1);
		
		TextView question = (TextView)findViewById(R.id.questionText);
		RadioButton r0 = (RadioButton)findViewById(R.id.radio0);
		RadioButton r1 = (RadioButton)findViewById(R.id.radio1);
		RadioButton r2 = (RadioButton)findViewById(R.id.radio2);
		RadioButton r3 = (RadioButton)findViewById(R.id.radio3);
		question.setText("Test");
		r0.setText(String.valueOf(numUnanswered));
		r1.setText(String.valueOf(numCorrect));
		r2.setText(String.valueOf(numIncorrect));
		r3.setText("Test");
	
//		LinearLayout linear=(LinearLayout) findViewById(R.id.textView2);
//	    data=calculateData(data);
//	    linear.addView(new MyGraphview(this,data));
		
	}
	
	public void getAnswers(){
		answers = getIntent().getIntArrayExtra("answers");
	}
	
	public void getResponses(){
		responses = getIntent().getIntArrayExtra("responses");
	}
	
}
