package com.example.databetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        textViewAge=findViewById(R.id.textViewAge);
        textViewName=findViewById(R.id.textViewName);

        //retrieve data
        Bundle data=getIntent().getExtras();
        String name=data.getString("name");
        int age=data.getInt("age");
        User user= (User) data.getSerializable("object");

        //setting the retrieved data
        textViewAge.setText(age);
        textViewName.setText(user.getName());

    }
}
