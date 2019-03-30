package com.example.ecg_android;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Channel_2_ButtonController extends AppCompatActivity implements Util_Button {
    private static Util_Button instance = new Channel_2_ButtonController();
    private final Button instanceButton;
    private final static int BUTTON_NAME = R.id.channel_2_Button;
    private Channel_2_ButtonController(){
        instanceButton = findViewById(BUTTON_NAME);
    }
    public Util_Button getInstance(){
        return instance;
    }
    public Util_Button setOnClickAction(){
        instanceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        return instance;
    }

    public Button getButton(){
        return instanceButton;
    }
}