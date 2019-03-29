package com.example.ecg_android;

public class ReadFromSdCardButton implements Util_Button {
    private static Util_Button instance = new ReadFromSdCardButton();
    private ReadFromSdCardButton(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
