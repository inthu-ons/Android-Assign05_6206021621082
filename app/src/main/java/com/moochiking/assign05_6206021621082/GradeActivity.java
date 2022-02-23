package com.moochiking.assign05_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GradeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCal , btnBack;
    private EditText showScore , showGrade , editScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        btnCal = (Button) findViewById(R.id.btnCal);
        btnBack = (Button) findViewById(R.id.btnBack);

        showGrade = (EditText) findViewById(R.id.showGrade);
        showScore = (EditText) findViewById(R.id.showScore);
        editScore = (EditText) findViewById(R.id.editScore);

        btnCal.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.btnCal){
            calGrade();
        }
        else if (id == R.id.btnBack){
            finish();
        }
    }

    public void calGrade(){
        float score = Float.parseFloat(editScore.getText().toString());
        String grade ;
        if(score > 80 && score < 100){
            grade = "A";
        }
        else if(score > 75){
            grade = "B+";
        }
        else if(score > 70){
            grade = "B";
        }
        else if(score > 65){
            grade = "C+";
        }
        else if(score > 60){
            grade = "C";
        }
        else if(score > 55){
            grade = "D+";
        }
        else if(score > 50){
            grade = "D";
        }
        else {
            grade = "F";
        }

        showScore.setText(score +"");
        showGrade.setText(grade);

        clearInput();

    }

    public void clearInput(){
        editScore.setText("");
    }

}