package com.example.drawable;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;

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
        textView.setText("densityDpi==="+getResources().getDisplayMetrics().densityDpi+"width=="+getResources().getDisplayMetrics().widthPixels+"height=="+getResources().getDisplayMetrics().heightPixels);
        height.setText("status_bar======="+getStateBar2()+"navigation_bar========"+getNavigationBarHeight());

    }
    private int getStateBar2() {
        Class c = null;
        int statusBarHeight=0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            Object obj = c.newInstance();
            Field field = c.getField("status_bar_height");
            int x = Integer.parseInt(field.get(obj).toString());
             statusBarHeight = this.getResources().getDimensionPixelSize(x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return statusBarHeight;
    }

    private int getNavigationBarHeight() {
        Resources resources = getResources();
        int resourceId = resources.getIdentifier("navigation_bar_height","dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        Log.v("dbw", "Navi height:" + height);
        return height;
    }


    public void buttonClick(View view) {
        width.setText("width=="+imageView.getWidth());
        height.setText("height=="+imageView.getHeight());
//        Toast.makeText(this, "图片宽度：" + imageView.getWidth(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "图片高度：" + imageView.getHeight(), Toast.LENGTH_SHORT).show();
    }

}
