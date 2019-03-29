package com.example.ecg_android;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class RunMeasurementButtonController extends AppCompatActivity implements Util_Button {
    private static Util_Button instance = new RunMeasurementButtonController();
    private final Button instanceButton;
    private final static int BUTTON_NAME = R.id.runMeasurementButton;
    private RunMeasurementButtonController(){
        instanceButton = findViewById(BUTTON_NAME);
    }
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
    public Button getButton(){

    }
}
