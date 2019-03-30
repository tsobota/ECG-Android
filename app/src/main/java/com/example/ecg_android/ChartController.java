package com.example.ecg_android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ChartController {
    private static ChartController instance = new ChartController();
    private ChartController(){}
    public static ChartController getInstance(){
        return instance;
    }

    public void runChart(View view) {
        final LineChart chart = view.findViewById(R.id.chart);

        MeasurementData[] dataObjects= new  MeasurementData[100];
        for(int i=0;i<dataObjects.length;i++) {
            dataObjects[i]=new  MeasurementData(i,i);
        }

        List<Entry> entries = new ArrayList<Entry>();

        for (MeasurementData data : dataObjects) {

            // turn your data into Entry objects
            entries.add(new Entry(data.getValue(), data.getTime()));
        }

        LineDataSet dataSet = new LineDataSet(entries, "Label"); // add entries to dataset
        dataSet.setColor(Color.BLACK);
        dataSet.setValueTextColor(Color.GREEN); // styling, ...

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }
}
