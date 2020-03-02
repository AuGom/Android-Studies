package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int randomNumber(){

        int num=new Random().nextInt(11);
        return num;

    }

    public void alterText(View view){

        TextView text=findViewById(R.id.textView);
        text.setText("Número sorteado: "+ randomNumber());

    }

}
