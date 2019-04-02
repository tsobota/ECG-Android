package com.example.ecg_android;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean measur=false;
    boolean connect=false;
    boolean odp1=false;
    boolean odp2=false;
    boolean odp3=false;
    boolean sd_card_write=false;
    boolean sd_card_read=false;
    boolean file_write=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LayoutInitializer aplikacja = new LayoutInitializer();
        aplikacja.doInit(findViewById(android.R.id.content));



    }

    public void Click(View view) {
        switch (view.getId())
        {
            case R.id.runMeasurementButton:
                final Button button_runMeasurementButton = findViewById(R.id.runMeasurementButton);

                if(measur==false)
                {
                    button_runMeasurementButton.setBackgroundColor(Color.GREEN);
                    button_runMeasurementButton.setTextColor(Color.BLACK);
                    measur=true;
                }
                else
                {
                    button_runMeasurementButton.setBackgroundColor(Color.LTGRAY;
                    button_runMeasurementButton.setTextColor(Color.BLACK);
                    measur=false;
                }

                break;

            case R.id.connectButton:
                final Button button_connectButton = findViewById(R.id.connectButton);

                if(connect==false)
                {
                    button_connectButton.setBackgroundColor(Color.GREEN);
                    button_connectButton.setTextColor(Color.BLACK);
                    connect=true;
                }
                else
                {
                    button_connectButton.setBackgroundColor(Color.LTGRAY);
                    button_connectButton.setTextColor(Color.BLACK);
                    connect=false;
                }

                break;

            case R.id.channel_1_Button:
                final Button button_channel_1_Button = findViewById(R.id.channel_1_Button);

                if(odp1==false)
                {
                    button_channel_1_Button.setBackgroundColor(Color.GREEN);
                    button_channel_1_Button.setTextColor(Color.BLACK);
                    odp1=true;
                }
                else
                {
                    button_channel_1_Button.setBackgroundColor(Color.LTGRAY);
                    button_channel_1_Button.setTextColor(Color.BLACK);
                    odp1=false;
                }

                break;

            case R.id.channel_2_Button:
                final Button button_channel_2_Button = findViewById(R.id.channel_2_Button);

                if(odp2==false)
                {
                    button_channel_2_Button.setBackgroundColor(Color.GREEN);
                    button_channel_2_Button.setTextColor(Color.BLACK);
                    odp2=true;
                }
                else
                {
                    button_channel_2_Button.setBackgroundColor(Color.LTGRAY);
                    button_channel_2_Button.setTextColor(Color.BLACK);
                    odp2=false;
                }

                break;

            case R.id.channel_3_Button:
                final Button button_channel_3_Button = findViewById(R.id.channel_3_Button);

                if(odp3==false)
                {
                    button_channel_3_Button.setBackgroundColor(Color.GREEN);
                    button_channel_3_Button.setTextColor(Color.BLACK);
                    odp3=true;
                }
                else
                {
                    button_channel_3_Button.setBackgroundColor(Color.LTGRAY);
                    button_channel_3_Button.setTextColor(Color.BLACK);
                    odp3=false;
                }

                break;

            case R.id.saveToSdCardButton:
                final Button button_saveToSdCardButton = findViewById(R.id.saveToSdCardButton);

                if(sd_card_write==false)
                {
                    button_saveToSdCardButton.setBackgroundColor(Color.GREEN);
                    button_saveToSdCardButton.setTextColor(Color.BLACK);
                    sd_card_write=true;
                }
                else
                {
                    button_saveToSdCardButton.setBackgroundColor(Color.LTGRAY);
                    button_saveToSdCardButton.setTextColor(Color.BLACK);
                    sd_card_write=false;
                }

                break;

            case R.id.saveToFileButton:
                final Button button_saveToFileButton = findViewById(R.id.saveToFileButton);

                if(file_write==false)
                {
                    button_saveToFileButton.setBackgroundColor(Color.GREEN);
                    button_saveToFileButton.setTextColor(Color.BLACK);
                    file_write=true;
                }
                else
                {
                    button_saveToFileButton.setBackgroundColor(Color.LTGRAY);
                    button_saveToFileButton.setTextColor(Color.BLACK);
                    file_write=false;
                }

                break;

            case R.id.readFromSdCardButton:
                final Button button_readFromSdCardButton = findViewById(R.id.readFromSdCardButton);

                if(sd_card_read==false)
                {
                    button_readFromSdCardButton.setBackgroundColor(Color.GREEN);
                    button_readFromSdCardButton.setTextColor(Color.BLACK);
                    sd_card_read=true;
                }
                else
                {
                    button_readFromSdCardButton.setBackgroundColor(Color.LTGRAY);
                    button_readFromSdCardButton.setTextColor(Color.BLACK);
                    sd_card_read=false;
                }

                break;

        }


    }
}
