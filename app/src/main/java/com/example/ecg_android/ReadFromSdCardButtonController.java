package com.example.ecg_android;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ReadFromSdCardButtonController extends AppCompatActivity implements Util_Button {
    private static Util_Button instance = new ReadFromSdCardButtonController();
    private final Button instanceButton;
    private final static int BUTTON_NAME = R.id.readFromSdCardButton;
    private ReadFromSdCardButtonController(){
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
