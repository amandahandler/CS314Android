package com.example.foundationsofsuccessfulprogramminginjava;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.question);
		Question q = QuestionList.q1;
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
		int correctAnswer = q.correct;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
