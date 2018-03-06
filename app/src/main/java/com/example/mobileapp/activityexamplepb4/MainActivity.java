package com.example.mobileapp.activityexamplepb4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText emailET, passET;
    private TextView showEmailTV, showPassTV;
    private Button loginBtn, regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailET = findViewById(R.id.emailValue);
        passET = findViewById(R.id.passValue);
        showEmailTV = findViewById(R.id.showEmail);
        showPassTV = findViewById(R.id.showPass);
        loginBtn = findViewById(R.id.lgnBtn);
        regBtn = findViewById(R.id.regBtn);
        loginBtn.setOnClickListener(this);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    public void loginUser(View view) {
        String inputEmail = emailET.getText().toString();
        String inputPass = passET.getText().toString();
        if(inputEmail.isEmpty()){
            emailET.setError(getString(R.string.email_error));
        }else if(inputPass.isEmpty()){
            passET.setError(getString(R.string.pass_error));
        }else{
            /*showEmailTV.setText(inputEmail);
            showPassTV.setText(inputPass);*/
            authenticateUser(inputEmail,inputPass);
        }
    }

    private void authenticateUser(String inputEmail, String inputPass) {
        if(inputEmail.equals(Constants.User.EMAIL_ADDRESS) &&
                inputPass.equals(Constants.User.PASSWORD)){

            //declare Explicit intent
            Student student = new Student("Hassan",19);
            Intent intent = new Intent(MainActivity.this,HomeActivity.class);
            intent.putExtra("email",inputEmail);
            intent.putExtra("pass",inputPass);
            intent.putExtra("student",student);
            startActivity(intent);
        }else{
            Toast.makeText(this, getString(R.string.authentication_error), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lgnBtn:

                break;
            case R.id.regBtn:

                break;
        }
        String inputEmail = emailET.getText().toString();
        String inputPass = passET.getText().toString();
        if(inputEmail.isEmpty()){
            emailET.setError(getString(R.string.email_error));
        }else if(inputPass.isEmpty()){
            passET.setError(getString(R.string.pass_error));
        }else{
            /*showEmailTV.setText(inputEmail);
            showPassTV.setText(inputPass);*/
            authenticateUser(inputEmail,inputPass);
        }
    }

    public void handleClick(View view) {

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
        }
    };
}
