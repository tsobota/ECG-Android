package com.example.ecg_android;

import java.util.ArrayList;
import java.util.List;

public class ChartController {
    private static ChartController instance = new ChartController();
    private ChartController(){}
    public static ChartController getInstance(){
        return instance;
    }

    public void runChart() {
        final LineChart chart = (LineChart) findViewById(R.id.chart);

        MeasurementData[] dataObjects= new  MeasurementData[100];
        for(int i=0;i<dataObjects.length;i++) {
            dataObjects[i]=new  MeasurementData(i,i);
        }

        List<Entry> entries = new ArrayList<Entry>();

        for (MeasurementData data : dataObjects) {

            // turn your data into Entry objects
            entries.add(new Entry(data.getValue(), data.getTime()));
        }

        LineData dataSet = new LineDataSet(entries, "Label"); // add entries to dataset
        dataSet.setColor();
        dataSet.setValueTextColor(...); // styling, ...

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }
}
