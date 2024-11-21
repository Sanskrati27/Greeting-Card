package com.example.greetingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AnniversaryCard extends AppCompatActivity {
    public static  final  String WISH = "com.example.greetingcard.WISH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anniversary_card);
    }
    public void createAnniversaryCard(View view) {
        //We will handle the click on the button here
        //Build an Intent to open another activity

        Intent intent1 = new Intent(this,FinalAnniversaryCard.class);

        EditText editText1 = findViewById(R.id.wifeName);
        EditText editText2 = findViewById(R.id.husbandName);

        String message = " Wishing more laughter, more joy, more love for the both of you in the years to come... \n Happy Wedding Anniversary "
                        + editText1.getText().toString() + " & " + editText2.getText().toString() + "...";
        intent1.putExtra(WISH, message);
        startActivity(intent1);
    }
}