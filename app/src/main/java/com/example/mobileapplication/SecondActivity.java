package com.example.mobileapplication;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        // Get the value passed from MainActivity
        String value = getIntent().getStringExtra("value");

        // Set the value to the TextView
        textView.setText(value);
    }
}

