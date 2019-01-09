package com.example.testprofiler;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },1000000);
    }
}
