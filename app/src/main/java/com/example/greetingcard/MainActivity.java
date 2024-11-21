package com.example.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.birthdayButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birthdayCard();
            }
        });

        button2 = (Button)findViewById(R.id.anniversaryButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anniversaryCard();
            }
        });
    }
    public void birthdayCard(){
        Intent intent = new Intent(this, BirthdayCard.class);
        startActivity(intent);
    }
    public void anniversaryCard(){
        Intent intent = new Intent(this, AnniversaryCard.class);
        startActivity(intent);
    }
}