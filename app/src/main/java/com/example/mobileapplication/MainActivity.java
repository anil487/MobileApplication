package com.example.mobileapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button openBrowserBtn, passValueBtn;
    EditText editText;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openBrowserBtn = findViewById(R.id.btnbrowser);
        passValueBtn = findViewById(R.id.passvalue);
        editText = findViewById(R.id.editText);


        openBrowserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tu.edu.np/"));
                startActivity(browserIntent);
            }
        });

        passValueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pass value to another activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
