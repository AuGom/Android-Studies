package com.example.databetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendButton=findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), SecondaryActivity.class);

                //creating new object
                User user=new User("Augsto","shambala@lambasha.com");

                //pass data
                intent.putExtra("name","Augusto");
                intent.putExtra("age","24");
                intent.putExtra("object",user);
                startActivity(intent);
            }
        });
    }
}
