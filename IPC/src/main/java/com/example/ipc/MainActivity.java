package com.example.ipc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     private TextView name;
     public static String age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.test1);
        name.setText("process_id=="+Process.myPid());

    }

    public void test(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("data","test");
        startActivity(intent);
    }

    public static String getAge(){
        return "101";
    }
}
