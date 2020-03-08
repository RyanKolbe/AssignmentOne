package com.ryankolbe.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.editTextPgOne);
        TextView textViewPgOne = findViewById(R.id.textViewPgOne);
        String initialTextViewMessage = getIntent().getStringExtra("Key");
        textViewPgOne.setText(initialTextViewMessage);
        message = input.getText().toString();

        Button buttonPgOne = findViewById(R.id.buttonPgOne);
        buttonPgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, ActivityTwo.class);
                mainIntent.putExtra("Key", message);
                startActivity(mainIntent);
            }
        });
    }
}