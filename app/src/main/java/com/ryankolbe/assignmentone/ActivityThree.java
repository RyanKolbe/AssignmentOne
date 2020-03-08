package com.ryankolbe.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityThree extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        message = String.format("%s \n I have read the message", getIntent().getStringExtra("Key"));

        Button buttonPgThree = findViewById(R.id.buttonPgThree);
        buttonPgThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdIntent = new Intent(ActivityThree.this, ActivityFour.class);
                thirdIntent.putExtra("Key", message);
                startActivity(thirdIntent);
            }
        });
    }
}

