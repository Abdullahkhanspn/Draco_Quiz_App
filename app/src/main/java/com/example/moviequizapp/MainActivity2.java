package com.example.moviequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private String [] questions ={"Shang-Chi And The Legend Of The Ten Rings - Release in 1921?","Raya And The Last Dragon - Release in 2021?",
    "Dungeons & Dragons: Honor Among Thieves - Release in 2013?","Merlin - Release in 1998?","Eragon - Release in 2006?"};
    private boolean[] answers ={false,true,false,true,true};
    TextView question;
    private int index=0;
    private int score=0;
    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If array is not going out of bounds.
                if (index <= questions.length - 1) {
                    //If you have given the correct answer,
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity2.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If array is not going out of bounds.
                if (index <= questions.length - 1) {
                    //If you have given the correct answer,
                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity2.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}