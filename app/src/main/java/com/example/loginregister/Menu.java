package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button buttonLaptop, buttonPhone, buttonStorage, buttonOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonLaptop = (Button) findViewById(R.id.buttonLaptop);
        buttonPhone = (Button) findViewById(R.id.buttonPhone);
        buttonStorage = (Button) findViewById(R.id.buttonStorage);
        buttonOthers = (Button) findViewById(R.id.buttonOthers);

        buttonLaptop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(Menu.this, halaman1.class);
                startActivity(myIntent);
            }
        });

        buttonPhone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(Menu.this, halaman2.class);
                startActivity(myIntent);
            }
        });

        buttonStorage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(Menu.this, halaman3.class);
                startActivity(myIntent);
            }
        });

        buttonOthers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(Menu.this, halaman4.class);
                startActivity(myIntent);
            }
        });
    }
}
