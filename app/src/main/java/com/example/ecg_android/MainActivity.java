package com.example.ecg_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInitializer aa = new LayoutInitializer();
        aa.doInit(findViewById(android.R.id.content));
    }
}
