package com.ryankolbe.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        message = String.format("%s \n I have read the message", getIntent().getStringExtra("Key"));

        Button buttonPgTwo = findViewById(R.id.buttonPgTwo);
        buttonPgTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(ActivityTwo.this, ActivityThree.class);
                secondIntent.putExtra("Key", message);
                startActivity(secondIntent);
            }
        });
    }
}