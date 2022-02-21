package com.moochiking.assign05_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button calGradeButton , calVatButton , calGpaButton , showGalleryButton , exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calGradeButton = (Button) findViewById(R.id.calGradeBtn);
        calVatButton = (Button) findViewById(R.id.calVatBtn);
        calGpaButton = (Button) findViewById(R.id.calGpaBtn);
        showGalleryButton = (Button) findViewById(R.id.galleryBtn);
        exitButton = (Button) findViewById(R.id.exitBtn);


        calGradeButton.setOnClickListener(this);
        calVatButton.setOnClickListener(this);
        calGpaButton.setOnClickListener(this);
        showGalleryButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.calGradeBtn){
            Intent gradeIntent = new Intent(this, GradeActivity.class);
            startActivity(gradeIntent);
        }
        else if (id == R.id.calVatBtn){
            Intent vatIntent = new Intent(this, VatActivity.class);
            startActivity(vatIntent);
        }
        else if (id == R.id.calGpaBtn){

        }
        else if (id == R.id.galleryBtn){

        }
        else if (id == R.id.exitBtn){
            finish();
        }
    }
}