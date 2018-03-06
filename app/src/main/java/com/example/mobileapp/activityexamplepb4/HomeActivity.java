package com.example.mobileapp.activityexamplepb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private TextView greetingsTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent incomingIntent = getIntent();
        String userEmail = incomingIntent.getStringExtra("email");
        String userPass = incomingIntent.getStringExtra("pass");
        Student student = (Student) incomingIntent.getSerializableExtra("student");
        greetingsTV = findViewById(R.id.greetings);
        greetingsTV.setText(getString(R.string.greetings));
        Toast.makeText(this, student.getName(), Toast.LENGTH_LONG).show();
    }
}
