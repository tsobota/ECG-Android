package com.example.ecg_android;

public class MeasurementData {
    private int value;
    private int time;

    public MeasurementData(int value, int time) {
        this.value=value;
        this.time=time;
    }

    public int getValue() {

        return value;
    }
    public int getTime() {
        return time;
    }
}
