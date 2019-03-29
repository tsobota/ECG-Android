package com.example.ecg_android;

public class Channel_1_Button implements Util_Button {
    private static Util_Button instance = new Channel_1_Button();
    private Channel_1_Button(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}