package com.example.headortails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView coin=findViewById(R.id.coin);
        Button back=findViewById(R.id.backButton);

        int rand=new Random().nextInt(2);
        if(rand==0){
            coin.setImageResource(R.drawable.moeda_cara);
        }else{
            coin.setImageResource(R.drawable.moeda_coroa);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });


    }
}
