package com.example.fragments.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.Fragments.ChatsFragment;
import com.example.fragments.R;

public class MainActivity extends AppCompatActivity {

    private Button chat;
    private Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        chat=findViewById(R.id.chatButton);
        call=findViewById(R.id.callButton);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);



        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
