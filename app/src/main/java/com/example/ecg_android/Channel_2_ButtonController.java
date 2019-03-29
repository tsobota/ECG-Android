package com.example.ecg_android;

public class Channel_2_ButtonController implements Util_Button {
    private static Util_Button instance = new Channel_2_ButtonController();
    private Channel_2_ButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}