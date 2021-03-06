package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.provider.AlarmClock;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = findViewById(R.id.btnDemo);
        mButton.setOnClickListener(this); //hey the implementation for this onclick is in this class

        Spinner cSpinner = findViewById(R.id.dishesSpinner);
        cSpinner.setOnItemSelectedListener(this);
        /*String name = getIntent().getExtras().getString("ap");
        TextView mTextView = findViewById(R.id.tvMain);
        mTextView.setText(name);*/
    }

    public void clickHandler(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                startHome();
                break;
            case R.id.btnCancel:
                createAlarm("bajaj", 14, 29);
                break;
            case R.id.btnFinish:
                sendContact();
                break;
        }
    }

    private void sendContact() {
        EditText nameEditText = findViewById(R.id.etName);
        String contact = nameEditText.getText().toString();
        Intent cIntent = new Intent();
        cIntent.putExtra("con", contact);
        setResult(RESULT_OK, cIntent);
        finish();
    }

    public void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private void startHome() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        Intent mIntent;
        mIntent = new Intent(MainActivity.this, HomeActivity.class);
        mIntent.putExtra("ba", "barry allen");
        startActivity(mIntent);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String itemName = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(this, itemName, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}