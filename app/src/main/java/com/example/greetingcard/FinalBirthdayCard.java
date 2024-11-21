package com.example.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalBirthdayCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_birthday_card);

        Intent intent = getIntent();
        String message = intent.getStringExtra(BirthdayCard.MSG);

        //Set text inside textview to message
        TextView textView = findViewById(R.id.birthdayWish);
        textView.setText(message);
    }
}