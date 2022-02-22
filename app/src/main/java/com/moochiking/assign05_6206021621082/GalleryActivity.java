package com.moochiking.assign05_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton  imageButton1 , imageButton2 , imageButton3 , imageButton4 , imageButton5 , imageButton6 , imageButton7 , imageButton8 ;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

        imageView = (ImageView) findViewById(R.id.imageView);

        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.imageButton1){
            imageView.setImageResource(R.drawable.p1);
        }
        else if(id == R.id.imageButton3){
            imageView.setImageResource(R.drawable.p3);
        }
        else if(id == R.id.imageButton4){
            imageView.setImageResource(R.drawable.p4);
        }
        else if(id == R.id.imageButton5){
            imageView.setImageResource(R.drawable.p5);
        }
        else if(id == R.id.imageButton6){
            imageView.setImageResource(R.drawable.p6);
        }
        else if(id == R.id.imageButton7){
            imageView.setImageResource(R.drawable.p7);
        }
        else if(id == R.id.imageButton8){
            imageView.setImageResource(R.drawable.p8);
        }
        else if(id == R.id.imageButton2){
            imageView.setImageResource(R.drawable.p2);
        }
    }
}