package com.example.ecg_android;

public class Channel_1_ButtonController implements Util_Button {
    private static Util_Button instance = new Channel_1_ButtonController();
    private Channel_1_ButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}