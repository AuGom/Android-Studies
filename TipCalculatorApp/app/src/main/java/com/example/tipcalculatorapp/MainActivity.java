package com.example.tipcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView percent;
    private TextView tip;
    private TextView total;
    private SeekBar tipPercent;
    private  double percentage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total=findViewById(R.id.textView6);
        inputText=findViewById(R.id.inputText);
        percent=findViewById(R.id.textView);
        tip=findViewById(R.id.textView4);
        tipPercent=findViewById(R.id.seekBar);

        tipPercent.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentage=progress;
                percent.setText(Math.round(percentage)+"%");
                calculate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

    }

    public void calculate(){
        String value=inputText.getText().toString();
        if(value==null || value==""){
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor.",
                    Toast.LENGTH_LONG
            );
        }else{
            double entry=Double.parseDouble(value);
            double tipped=entry*(percentage/100);
            tip.setText(Double.toString(Math.round(tipped)));
            total.setText(Double.toString(Math.round(tipped)+entry));
        }
    }
}
