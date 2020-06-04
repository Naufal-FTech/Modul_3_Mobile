package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class halaman1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        final ListView list = findViewById(R.id.laptopList);
        ArrayList<String> laptopList = new ArrayList<>();
        laptopList.add("Acer");
        laptopList.add("Lenovo");
        laptopList.add("Asus");
        laptopList.add("HP");
        laptopList.add("Dell");
        laptopList.add("Macbook");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, laptopList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Toast.makeText(halaman1.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}
