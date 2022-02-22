package com.moochiking.assign05_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class GpaActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editGrade1 , editGrade2 , editGrade3 , editGrade4 , showPoint , showCredit , showGPA;
    private Button btnCal , btnBack;

    public static DecimalFormat formatter = new DecimalFormat("###.00");

    float credits = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        editGrade1 = (EditText) findViewById(R.id.editGrade1);
        editGrade2 = (EditText) findViewById(R.id.editGrade2);
        editGrade3 = (EditText) findViewById(R.id.editGrade3);
        editGrade4 = (EditText) findViewById(R.id.editGrade4);

        showPoint = (EditText) findViewById(R.id.showPoint);
        showCredit = (EditText) findViewById(R.id.showCredit);
        showGPA = (EditText) findViewById(R.id.showGPA);

        btnCal = (Button) findViewById(R.id.btnGpa);
        btnBack = (Button) findViewById(R.id.btnGpaBack);


        btnCal.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.btnGpa){
            credits = 0;
            float gradeToPoint1 , gradeToPoint2 , gradeToPoint3 , gradeToPoint4 , totalPoint;
            gradeToPoint1 = calPoint(editGrade1);
            gradeToPoint2 = calPoint(editGrade2);
            gradeToPoint3 = calPoint(editGrade3);
            gradeToPoint4 = calPoint(editGrade4);

            totalPoint = gradeToPoint1 + gradeToPoint2 + gradeToPoint3 + gradeToPoint4;

            showPoint.setText(formatter.format(totalPoint) + "");
            showCredit.setText(formatter.format(credits) + "");
            showGPA.setText(formatter.format(calGPA()) + "");

            clearInput();
        }
        else if(id == R.id.btnGpaBack){
            finish();
        }
    }

    public float calPoint(EditText gradeString){
        float point = 0;
        String grade = gradeString.getText().toString();

        if(grade.equals("A")){
            point = 4F * 3;
            countPoint();
        }
        else if(grade.equals("B+")){
            point = 3.5F * 3;
            countPoint();
        }
        else if(grade.equals("B")){
            point = 3F * 3;
            countPoint();
        }
        else if(grade.equals("C+")){
            point = 2.5F * 3;
            countPoint();
        }
        else if(grade.equals("C")){
            point = 2F * 3;
            countPoint();
        }
        else if(grade.equals("D+")){
            point = 1.5F * 3;
            countPoint();
        }
        else if(grade.equals("D")){
            point = 1F * 3;
            countPoint();
        }
        else {
            point = 0;
        }
        return point;
    }

    public void countPoint(){
        credits += 3;
    }

    public float calGPA(){

        float point = Float.parseFloat(showPoint.getText().toString());

        return point / credits;
    }

    public void clearInput(){
        editGrade1.setText("");
        editGrade2.setText("");
        editGrade3.setText("");
        editGrade4.setText("");
    }
}