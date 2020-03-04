package com.example.databetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        TextView textViewAge = findViewById(R.id.textViewAge);
        TextView textViewName = findViewById(R.id.textViewName);

        //retrieve data
        Bundle data=getIntent().getExtras();
        String name=data.getString("name");
        String age=data.getString("age");
        User user= (User) data.getSerializable("object");

        //setting the retrieved data
        textViewAge.setText(age);
        textViewName.setText(user.getName());

    }
}
