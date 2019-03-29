package com.example.ecg_android;

public class SaveToFileButtonController implements Util_Button {
    private static Util_Button instance = new SaveToFileButtonController();
    private SaveToFileButtonController(){}
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){

    }
}
