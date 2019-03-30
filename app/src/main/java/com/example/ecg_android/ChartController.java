package com.example.ecg_android;




import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ChartController extends AppCompatActivity {
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

        LineDataSet dataSet = new LineDataSet(entries, "Label"); // add entries to dataset
        dataSet.setColor(10);
        dataSet.setValueTextColor(10); // styling, ...

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }
}
