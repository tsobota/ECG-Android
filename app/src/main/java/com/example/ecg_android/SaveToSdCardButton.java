package com.example.ecg_android;

public class SaveToSdCardButton implements Util_Button {
    private static Util_Button instance = new SaveToSdCardButton();
    private SaveToSdCardButton(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
