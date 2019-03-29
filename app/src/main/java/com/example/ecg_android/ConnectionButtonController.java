package com.example.ecg_android;

public class ConnectionButtonController implements Util_Button {
    private static Util_Button instance = new ConnectionButtonController();
    private ConnectionButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
