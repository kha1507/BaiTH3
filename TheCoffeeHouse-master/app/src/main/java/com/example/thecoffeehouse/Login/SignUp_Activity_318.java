package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.thecoffeehouse.R;

public class SignUp_Activity_318 extends AppCompatActivity {

    Button signup_318;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_318);
        signup_318 = findViewById(R.id.bt_signup_318);
        signup_318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Activity_318.this, "Sign up success", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignUp_Activity_318.this, SignIn_Activity_318.class);


            }
        });
    }
}