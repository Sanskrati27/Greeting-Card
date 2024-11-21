package com.example.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalAnniversaryCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_anniversary_card);

        Intent intent = getIntent();
        String message = intent.getStringExtra(AnniversaryCard.WISH);

        //Set text inside textview to message
        TextView textView = findViewById(R.id.anniversaryWish);
        textView.setText(message);
    }
}