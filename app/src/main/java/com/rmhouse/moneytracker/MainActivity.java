package com.rmhouse.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Homework", "Start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Homework", "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Homework", "Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Homework", "Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Homework", "Restart");
    }
}
