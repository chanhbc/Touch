package com.touch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout rlDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rlDemo = (RelativeLayout) findViewById(R.id.rl_demo);
        CustomView customView = new CustomView(App.getContext());
        rlDemo.addView(customView, new RelativeLayout.LayoutParams(-1, -1));
    }
}
