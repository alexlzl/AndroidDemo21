package com.example.layoutinflater;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.LayoutInflaterFactory;

public class MainActivity extends AppCompatActivity {
    private String TAG="MainActivity";
    public static Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (typeface == null)
        {
            typeface = Typeface.createFromAsset(getAssets(), "School_Writing.ttf");
        }
        LayoutInflaterCompat.setFactory(LayoutInflater.from(this), new LayoutInflaterFactory()
        {
            @Override
            public View onCreateView(View parent, String name, Context context, AttributeSet attrs)
            {
                AppCompatDelegate delegate = getDelegate();
                View view = delegate.createView(parent, name, context, attrs);

                if ( view!= null && (view instanceof TextView))
                {
                    ((TextView) view).setTypeface(typeface);
                }
                return view;
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
