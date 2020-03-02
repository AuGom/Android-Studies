package com.example.quotesapp;

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

    public void newQuote(View view){
        String[] quotes={"Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        "Duis laoreet semper fermentum.",
                        "Nam sit amet ante ac odio mollis rutrum.",
                        "Vivamus ultrices, purus et dignissim gravida, lectus mauris cursus mi, ac lacinia nunc nisl id ex.",
                        "Nulla in sem egestas, ullamcorper massa a, gravida diam."};
        TextView text=findViewById(R.id.textView);
        int selectedQuote=new Random().nextInt(4);
        text.setText(quotes[selectedQuote]);
    }
}
