package com.example.whichfuelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText gas, alcohol;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gas=findViewById(R.id.gasPrice);
        alcohol=findViewById(R.id.alcoholPrice);
        textResult=findViewById(R.id.result);
    }

    public void calculate(View view){
        String gasPrice=gas.getText().toString();
        String alcoholPrice=alcohol.getText().toString();
        if(validation(gasPrice, alcoholPrice)){
            double gas=Double.parseDouble(gasPrice);
            double alcohol=Double.parseDouble(alcoholPrice);
            if((alcohol/gas)>=0.7)
                textResult.setText("Melhor usar gasolina.");
            else
                textResult.setText("Melhor usar alcool.");
        }

    }

    public boolean validation(String gas, String alcohol){
        if(gas==null || gas=="" ||
           alcohol==null || alcohol=="")
            return false;
        else
            return true;
    }
}
