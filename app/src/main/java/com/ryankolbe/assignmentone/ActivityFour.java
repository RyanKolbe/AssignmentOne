package com.ryankolbe.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFour extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        message = String.format("%s \n I have read the message", getIntent().getStringExtra("Key"));

        Button buttonPgFour = findViewById(R.id.buttonPgFour);
        buttonPgFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourthIntent = new Intent(ActivityFour.this, MainActivity.class);
                fourthIntent.putExtra("Key", message);
                startActivity(fourthIntent);
            }
        });
    }
}