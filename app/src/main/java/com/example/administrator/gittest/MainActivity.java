package com.example.administrator.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";
    private final static String TAG1 = "AppCompatActivity";
    private final static String TAG2 = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
