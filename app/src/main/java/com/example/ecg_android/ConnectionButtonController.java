package com.example.ecg_android;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConnectionButtonController extends AppCompatActivity implements Util_Button {
    private final static Util_Button instance = new ConnectionButtonController();
    private final Button instanceButton;
    private final static int BUTTON_NAME = R.id.connectButton;
    private ConnectionButtonController(){
        instanceButton = findViewById(BUTTON_NAME);
    }
    public static Util_Button getInstance(){
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
