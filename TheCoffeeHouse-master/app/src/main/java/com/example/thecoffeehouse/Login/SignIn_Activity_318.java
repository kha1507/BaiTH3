package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity_318;
import com.example.thecoffeehouse.R;

public class SignIn_Activity_318 extends AppCompatActivity {

    Button signin_318;
    EditText edtemail_318, edtpassword_318;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in__318);

        edtemail_318=(EditText) findViewById(R.id.edtEmail_318);
        edtpassword_318=(EditText) findViewById(R.id.edtPassword_318);
        signin_318=(Button) findViewById(R.id.btn_signin_318);
        signin_318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (edtemail_318.getText().length() != 0 && edtpassword_318.getText().length() != 0) {
            if (edtemail_318.getText().toString().equals("1811505310318") && edtpassword_318.getText().toString().equals("kha123")) {
                Toast.makeText(SignIn_Activity_318.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();

                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(SignIn_Activity_318.this, MainActivity_318.class);
                startActivity(intent);

            } else {
                Toast.makeText(SignIn_Activity_318.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(SignIn_Activity_318.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }
}