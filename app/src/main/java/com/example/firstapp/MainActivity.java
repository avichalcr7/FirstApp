package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = getIntent().getExtras().getString("ap");
        TextView mTextView = findViewById(R.id.tvMain);
        mTextView.setText(name);
    }
    public void clickHandler(View view) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        Intent mIntent;
        mIntent  = new Intent(MainActivity.this,HomeActivity.class);
        mIntent.putExtra("ba","barry allen");
        startActivity(mIntent);
    }
}