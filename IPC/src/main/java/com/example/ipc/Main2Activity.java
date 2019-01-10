package com.example.ipc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
       private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.test);
        name.setText("processid==="+ Process.myPid()+getIntent().getStringExtra("data"));
    }

    public void test2(View view){
        MainActivity.age="100";
        name.setText( MainActivity.getAge());
    }

    public void next(View view){
        startActivity(new Intent(this,Main3Activity.class));
    }
}
