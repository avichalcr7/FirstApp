package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class RecyclerActivity extends AppCompatActivity {
    public static String TAG = RecyclerActivity.class.getSimpleName();

    String[] countries = new String[]{"Russia", "United Kingdom", "India", "Portugal", "USA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "creating");
        setContentView(R.layout.activity_recycler);
        RecyclerView countriesRecyclerView = findViewById(R.id.countriesRview);
        CountriesAdapter adapter = new CountriesAdapter(countries);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        countriesRecyclerView.setLayoutManager(layoutManager);
        countriesRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(TAG, "starting");
        int j = 1;
        for (int i = 1; i < 20; i++) {
            j = i * 5 + 10 - 13;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "stopping");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "destroy");
    }
}