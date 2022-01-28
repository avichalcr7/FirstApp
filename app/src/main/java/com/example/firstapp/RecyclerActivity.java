package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {

    String[] countries = new String[]{"Russia","United Kingdom","India","Portugal","USA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView countriesRecyclerView = findViewById(R.id.countriesRview);
    }
}