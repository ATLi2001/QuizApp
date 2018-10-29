package com.example.atli.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        RadioButton q1A = (RadioButton) findViewById(R.id.Q1A);

        if (q1A.isChecked())
            score++;


        EditText q2 = (EditText) findViewById(R.id.Q2);
        String q2_text = q2.getText().toString();

        if(q2_text.matches("Euler"))
            score++;


        CheckBox q3_1 = (CheckBox) findViewById(R.id.Q3_1);
        CheckBox q3_4 = (CheckBox) findViewById(R.id.Q3_4);
        CheckBox q3_5 = (CheckBox) findViewById(R.id.Q3_5);

        if (q3_1.isChecked() && q3_4.isChecked() && q3_5.isChecked())
            score++;

        RadioButton q4C = (RadioButton) findViewById(R.id.Q4C);

        if (q4C.isChecked())
            score++;

        Toast.makeText(getApplicationContext(),"You got "+score+" correct!", Toast.LENGTH_LONG).show();
        score=0;
    }

}
