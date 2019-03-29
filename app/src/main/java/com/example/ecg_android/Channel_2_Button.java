package com.example.ecg_android;

public class Channel_2_Button implements Util_Button {
    private static Util_Button instance = new Channel_2_Button();
    private Channel_2_Button(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}