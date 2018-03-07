package com.example.mobileapp.activityexamplepb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private TextView greetingsTextView, showEmailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Call Intent
        Intent incomingIntent = getIntent();
        String userEmail = incomingIntent.getStringExtra("email");
        String userPassword = incomingIntent.getStringExtra("password");

        //Student student = (Student) incomingIntent.getSerializableExtra("student");
        greetingsTextView = findViewById(R.id.greetingsTextView);
        greetingsTextView.setText(getString(R.string.greetings));
        showEmailTextView = findViewById(R.id.showEmailTextView);
        showEmailTextView.setText(userEmail);
//        Toast.makeText(this, student.getName(), Toast.LENGTH_LONG).show();
    }
}
