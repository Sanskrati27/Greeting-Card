package com.example.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BirthdayCard extends AppCompatActivity {

    public static  final  String MSG = "com.example.greetingcard.WISH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdy_card);
    }
    public void createBirthdayCard(View view){
        //We will handle the click on the button here
        //Build an Intent to open another activity

        Intent intent = new Intent(this,FinalBirthdayCard.class);
        EditText editText1 = findViewById(R.id.birthdayPersonName);
        String message = " Happy Birthday!! \n" + editText1.getText().toString() + "...\n"
                        + "I hope you have a great day today and the year ahead is full of many blessings.." ;
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}