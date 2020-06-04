package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.button_login);
        registerButton = (Button) findViewById(R.id.button3_register);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, Menu.class);
                startActivity(myIntent);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, Register.class);
                startActivity(myIntent);
            }
        });
    }

}
