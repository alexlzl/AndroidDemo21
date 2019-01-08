package com.example.drawable;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView width,height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.text);
        width=findViewById(R.id.width);
        height=findViewById(R.id.height);
        imageView=findViewById(R.id.image);
        textView.setText("densityDpi==="+getResources().getDisplayMetrics().densityDpi);

    }
    public void buttonClick(View view) {
        width.setText("width=="+imageView.getWidth());
        height.setText("height=="+imageView.getHeight());
//        Toast.makeText(this, "图片宽度：" + imageView.getWidth(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "图片高度：" + imageView.getHeight(), Toast.LENGTH_SHORT).show();
    }

}
