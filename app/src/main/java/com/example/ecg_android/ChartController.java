package com.example.ecg_android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ChartController {

    public ChartController(){
        entries = new ArrayList<Entry>();
    }

    private static  List<Entry> entries;
    private static LineDataSet dataSet;
    private static LineData lineData;
    private static LineChart chart;

    public void runChart(View view) {

        chart = view.findViewById(R.id.chart);
        MeasurementData[] dataObjects= new  MeasurementData[5];

        //Dodawanie poczatkowych danych
        for(int i=0;i<dataObjects.length;i++) {

            dataObjects[i]=new  MeasurementData(i,i);
        }

        for (MeasurementData data : dataObjects) {

            entries.add(new Entry(data.getValue(), data.getTime()));
        }

        dataSet = new LineDataSet(entries, "Label");
        dataSet.setColor(Color.BLUE);
        dataSet.setValueTextColor(Color.BLACK); // styling, ...

        lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }

    //Metoda dodajaca punkty do wykresu
    public void add_point( int value, int time)
    {
        dataSet.addEntry(new Entry(time,value));
        lineData.notifyDataChanged();
        chart.notifyDataSetChanged();
        chart.invalidate();

    }
}
