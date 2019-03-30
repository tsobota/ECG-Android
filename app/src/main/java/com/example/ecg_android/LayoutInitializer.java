package com.example.ecg_android;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class LayoutInitializer extends AppCompatActivity {

    public void doInit() {

        final Button connectButton = findViewById(R.id.connectButton);
        connectButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "Connect Button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);

                connectButton.setBackgroundColor(Color.BLACK);
                connectButton.setTextColor(Color.BLACK);

                toast.show();
            }
        });

        final Button runMeasurementButton = findViewById(R.id.runMeasurementButton);
        runMeasurementButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "runMeasurementButton";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final Button channel_1_Button = findViewById(R.id.channel_1_Button);
        channel_1_Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "channel_1_Button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final Button channel_2_Button = findViewById(R.id.channel_2_Button);
        channel_2_Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "channel_2_Button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final Button channel_3_Button = findViewById(R.id.channe_3_Button);
        channel_3_Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "channel_3_Button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final Button saveToFileButton = findViewById(R.id.saveToFileButton);
        saveToFileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "saveToFileButton";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final Button saveToSdCardButton = findViewById(R.id.saveToSdCardButton);
        saveToSdCardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "saveToSdCardButton";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        final Button readFromSdCardButton = findViewById(R.id.readFromSdCardButton);
        readFromSdCardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "readFromSdCardButton";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

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
