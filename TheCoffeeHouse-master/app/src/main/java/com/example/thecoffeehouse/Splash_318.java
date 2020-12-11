package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thecoffeehouse.Login.Login_318;

import static android.os.SystemClock.sleep;

public class Splash_318 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_318);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                sleep(5000);
                Intent i = new Intent(Splash_318.this, Login_318.class);
                startActivity(i);
            }
        });
        thread.start();
    }
}
