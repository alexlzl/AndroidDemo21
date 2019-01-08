package com.example.activity1;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        TextView textView = findViewById(R.id.show);
        textView.setText("getMemoryClass" + am.getMemoryClass() + "===getLargeMemoryClass===" + am.getLargeMemoryClass());
    }

    public void test1(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
