package com.example.foundationsofsuccessfulprogramminginjava;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class QuestionPage extends Activity {

	static int numQuestions = 10;
	private Question[] questions = new Question[numQuestions]; //questions presented 
	private int[] responses = new int[numQuestions];	//answers given
	private int questionNum = 0; //numbered viewed out of 10
	private int correctAnswer = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.question);
		for(int i = 0; i < numQuestions; i++){
			questions[i] = null;
			responses[i] = -1;
		}

		correctAnswer = initializeQuestion();

		/* This handles if question is answered correctly */
		final RadioGroup rGroup = (RadioGroup)findViewById(R.id.radioGroup1);
		rGroup.clearCheck();
		int checked = rGroup.indexOfChild(findViewById(rGroup.getCheckedRadioButtonId()));
		Log.d("Before checked id is: ", String.valueOf(checked));

		rGroup.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				TextView response = (TextView)findViewById(R.id.responseText);
				int checked = rGroup.indexOfChild(findViewById(rGroup.getCheckedRadioButtonId()));
				Log.d("CheckedId: ", String.valueOf(checked));
				if(checked == correctAnswer){
					response.setText("Correct!");
					response.setTextColor(Color.GREEN);
				}else{
					response.setText("Incorrect.");
					response.setTextColor(Color.RED);
				}
			}

		});

		Button next = (Button)findViewById(R.id.nextButton);
		next.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				correctAnswer = nextQuestion();
			}
		});
	}

	private int initializeQuestion(){
		questionNum++;
		if(questionNum == 1){
			Button back = (Button)findViewById(R.id.backButton);
			back.setVisibility(View.INVISIBLE);
		}else{
			Button back = (Button)findViewById(R.id.backButton);
			back.setVisibility(View.VISIBLE);
		}

		Question q;
		if(questions[questionNum] == null){
			//TODO: Change this to random question selection
			q = QuestionList.q1;
			//while(q.id)
		}else{
			q = questions[questionNum];
		}

		TextView question = (TextView)findViewById(R.id.questionText);
		RadioButton r0 = (RadioButton)findViewById(R.id.radio0);
		RadioButton r1 = (RadioButton)findViewById(R.id.radio1);
		RadioButton r2 = (RadioButton)findViewById(R.id.radio2);
		RadioButton r3 = (RadioButton)findViewById(R.id.radio3);
		question.setText(q.question);
		r0.setText(q.answers[0]);
		r1.setText(q.answers[1]);
		r2.setText(q.answers[2]);
		r3.setText(q.answers[3]);
		return q.correct;
	}

	private int nextQuestion(){
		// TODO Save current answer for later results
		return initializeQuestion();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
