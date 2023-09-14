package com.example.egzaminzadania4prano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Integer polubienia =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView =findViewById(R.id.textView);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        polubienia++;
                        textView.setText(polubienia.toString()+" polubień");
                    }
                }
        );
        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(polubienia>0)
                            polubienia--;
                        textView.setText(polubienia.toString()+" polubień");
                    }
                }
        );
    }
}