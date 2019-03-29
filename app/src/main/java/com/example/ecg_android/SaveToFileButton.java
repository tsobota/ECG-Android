package com.example.ecg_android;

public class SaveToFileButton implements Util_Button {
    private static Util_Button instance = new SaveToFileButton();
    private SaveToFileButton(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
