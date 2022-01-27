    package com.example.firstapp;

    import androidx.appcompat.app.AppCompatActivity;

    import android.nfc.Tag;
    import android.os.Bundle;
    import android.content.Intent;
    import android.view.View;
    import android.widget.Toast;
    import android.widget.TextView;
    import android.provider.AlarmClock;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            String name = getIntent().getExtras().getString("ap");
            TextView mTextView = findViewById(R.id.tvMain);
            mTextView.setText(name);
        }

        public void clickHandler(View view){
            switch(view.getId()){
                case R.id.btnLogin:
                    startHome();
                    break;
                case R.id.btnCancel:
                    createAlarm("bajaj training",14,48);
                    break;
            }
        }

        public void createAlarm(String message,int hour, int minutes){
            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM).putExtra(AlarmClock.EXTRA_MESSAGE, message).putExtra(AlarmClock.EXTRA_HOUR, hour).putExtra(AlarmClock.EXTRA_MINUTES, minutes);
            if(intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
            }
        }
        private void startHome() {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
            Intent mIntent;
            mIntent  = new Intent(MainActivity.this,HomeActivity.class);
            mIntent.putExtra("ba","barry allen");
            startActivity(mIntent);
        }
    }