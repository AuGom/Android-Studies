package com.example.jankenponapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rock(View view){
        this.userChoise(1);
    }

    public void scissor(View view){
        this.userChoise(2);
    }

    public void paper(View view){
        this.userChoise(3);
    }

    public void userChoise(int choice){

        ImageView app=findViewById(R.id.imageView);
        TextView text=findViewById(R.id.textView2);

        int num=new Random().nextInt(3);
        int appChoice=num;
        switch(appChoice){
            case 1:
                app.setImageResource(R.drawable.pedra);
                if(choice==1)
                    text.setText("Empate");
                else if(choice==2)
                    text.setText("voce perdeu");
                else
                    text.setText("voce ganhou");
                break;

            case 2:
                app.setImageResource(R.drawable.tesoura);
                if(choice==2)
                    text.setText("Empate");
                else if(choice==3)
                    text.setText("voce perdeu");
                else
                    text.setText("voce ganhou");
                break;

            case 3:
                app.setImageResource(R.drawable.papel);
                if(choice==3)
                    text.setText("Empate");
                else if(choice==1)
                    text.setText("voce perdeu");
                else
                    text.setText("voce ganhou");
                break;
        }
    }
}
