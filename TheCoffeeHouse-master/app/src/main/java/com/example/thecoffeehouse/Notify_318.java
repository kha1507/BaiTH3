package com.example.thecoffeehouse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Notify_318 extends AppCompatActivity {

    ImageView imgClose_318, img_318;
    Button bt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notify_action);

        imgClose_318 = findViewById(R.id.imageClose_318);
        imgClose_318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        bt = findViewById(R.id.button_318);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        img_318 = findViewById(R.id.image);
        img_318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    void open() {
        Intent view = new Intent(Notify_318.this, MainActivity_318.class);
        startActivity(view);
    }

    public void openDialog() {
        ExampleDialog_318 exampleDialog = new ExampleDialog_318();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
