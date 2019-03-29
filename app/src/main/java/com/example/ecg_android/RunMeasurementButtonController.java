package com.example.ecg_android;

public class RunMeasurementButtonController implements Util_Button {
    private static Util_Button instance = new RunMeasurementButtonController();
    private RunMeasurementButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
