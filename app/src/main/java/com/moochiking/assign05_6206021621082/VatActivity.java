package com.moochiking.assign05_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class VatActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editPrice , showProductPrice , showVatProduct , showTotalProduct;
    private Button btnCal , btnBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vat);

        editPrice = (EditText) findViewById(R.id.editPrice);
        showProductPrice = (EditText) findViewById(R.id.showProductPrice);
        showVatProduct = (EditText) findViewById(R.id.showVatProduct);
        showTotalProduct = (EditText) findViewById(R.id.showTotalProduct);

        btnCal = (Button) findViewById(R.id.btnVat);
        btnBack = (Button) findViewById(R.id.btnVatBack);

        btnCal.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.btnVat){
            float price = Float.parseFloat(editPrice.getText().toString());
            float vat = price * 7 / 100 ;
            float total = price + vat;

            DecimalFormat formatter = new DecimalFormat("#,###,###.00");

            showProductPrice.setText(formatter.format(price));
            showVatProduct.setText(formatter.format(vat));
            showTotalProduct.setText(formatter.format(total));

            clearInput();
        }
        else if(id == R.id.btnVatBack){
            finish();
        }

    }

    public void clearInput(){
        editPrice.setText("");
    }
}