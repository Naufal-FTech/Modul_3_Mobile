package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        final ListView list = findViewById(R.id.phoneList);
        ArrayList<String> phoneList = new ArrayList<>();
        phoneList.add("Samsung");
        phoneList.add("Xiaomi");
        phoneList.add("iPhone");
        phoneList.add("Asus");
        phoneList.add("Vivo");
        phoneList.add("Nokia");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, phoneList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Toast.makeText(halaman2.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}
