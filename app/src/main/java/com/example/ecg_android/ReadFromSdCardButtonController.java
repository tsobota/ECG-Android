package com.example.ecg_android;

public class ReadFromSdCardButtonController implements Util_Button {
    private static Util_Button instance = new ReadFromSdCardButtonController();
    private ReadFromSdCardButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
