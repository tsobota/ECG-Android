package com.example.ecg_android;

public class SaveToSdCardButtonController implements Util_Button {
    private static Util_Button instance = new SaveToSdCardButtonController();
    private SaveToSdCardButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
