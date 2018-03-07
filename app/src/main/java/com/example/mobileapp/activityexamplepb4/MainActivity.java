package com.example.mobileapp.activityexamplepb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText emailEditText, passwordEditText;
    private TextView showEmailTextView, showPasswordTextView;
    private Button loginButton, regButton, clearButton;
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Declare variable
        emailEditText = findViewById(R.id.emailText);
        passwordEditText = findViewById(R.id.passwordText);
        showEmailTextView = findViewById(R.id.showEmailTextView);
        showPasswordTextView = findViewById(R.id.showPasswordTextView);
        loginButton = findViewById(R.id.loginButton);
        regButton = findViewById(R.id.regButton);
        clearButton = findViewById(R.id.clearButton);

        // Call OnClickListener | implements View.OnClickListener
        loginButton.setOnClickListener(this);

        // Direct call OnClickListener
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Reg Button", Toast.LENGTH_SHORT).show();
            }
        });

        // Create View OnClickListener
        clearButton.setOnClickListener(clearListener);
    }


    public void loginUser(View view) {
        String inputEmail = emailEditText.getText().toString();
        String inputPass = passwordEditText.getText().toString();
        if (inputEmail.isEmpty()) {
            emailEditText.setError(getString(R.string.email_error));
        } else if (inputPass.isEmpty()) {
            passwordEditText.setError(getString(R.string.pass_error));
        } else {
            /*showEmailTV.setText(inputEmail);
            showPassTV.setText(inputPass);*/
            authenticateCheck(inputEmail, inputPass);
        }
    }

    private void authenticateCheck(String inputEmail, String inputPass) {
        if (inputEmail.equals(Constants.User.EMAIL_ADDRESS) && inputPass.equals(Constants.User.PASSWORD)) {
            //declare Explicit intent
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            // Pass value
            intent.putExtra("email", inputEmail);
            intent.putExtra("password", inputPass);
            // Pass object
            //Student student = new Student("Hassan", 19);
            //intent.putExtra("student", student);
            startActivity(intent);
        } else {
            Toast.makeText(this, getString(R.string.authentication_error), Toast.LENGTH_SHORT).show();
        }
    }

    // Action : Login Button
    @Override
    public void onClick(View view) {
        Log.i(TAG, "Login Button action...");

        String inputEmail = emailEditText.getText().toString();
        String inputPass = passwordEditText.getText().toString();

        if (inputEmail.isEmpty()) {
            emailEditText.setError(getString(R.string.email_error));
        } else if (inputPass.isEmpty()) {
            passwordEditText.setError(getString(R.string.pass_error));
        }

        switch (view.getId()) {
            case R.id.loginButton:
                authenticateCheck(inputEmail, inputPass);
                break;
            case R.id.regButton:
                // Write Code
                break;
        }
    }

    // Clear Action Button
    View.OnClickListener clearListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Clear Button", Toast.LENGTH_SHORT).show();
        }
    };
}
