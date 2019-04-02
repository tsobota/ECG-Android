package com.example.ecg_android;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean measur=false;
    boolean connect=false;
    boolean odp1=false;
    boolean odp2=false;
    boolean odp3=false;
    boolean sd_card_write=false;
    boolean sd_card_read=false;
    boolean file_write=false;
    Toast toast;
    Button button;

    ChartController wykres = new ChartController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wykres.runChart(findViewById(android.R.id.content));

        LayoutInitializer aplikacja = new LayoutInitializer();
        aplikacja.doInit(findViewById(android.R.id.content));

    }

    public void Click(View view) {
        switch (view.getId())
        {
            case R.id.runMeasurementButton:
                button = findViewById(R.id.runMeasurementButton);

                if(measur==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Rozpoczeto pomiar", Toast.LENGTH_SHORT);
                    toast.show();
                    measur=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    measur=false;
                }

                break;

            case R.id.connectButton:
                button = findViewById(R.id.connectButton);

                if(connect==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Polaczono z urzadzeniem", Toast.LENGTH_SHORT);
                    toast.show();
                    connect=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    connect=false;
                }

                break;

            case R.id.channel_1_Button:
                button = findViewById(R.id.channel_1_Button);

                if(odp1==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Pomiar z odprowadzenia: I", Toast.LENGTH_SHORT);
                    toast.show();
                    odp1=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    odp1=false;
                }

                break;

            case R.id.channel_2_Button:
                button = findViewById(R.id.channel_2_Button);

                if(odp2==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Pomiar z odprowadzenia: II", Toast.LENGTH_SHORT);
                    toast.show();
                    odp2=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    odp2=false;
                }

                break;

            case R.id.channel_3_Button:
                button = findViewById(R.id.channel_3_Button);

                if(odp3==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Pomiar z odprowadzenia: V1", Toast.LENGTH_SHORT);
                    toast.show();
                    odp3=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    odp3=false;
                }

                break;

            case R.id.saveToSdCardButton:
                button = findViewById(R.id.saveToSdCardButton);

                if(sd_card_write==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Zapis na karte SD", Toast.LENGTH_SHORT);
                    toast.show();
                    sd_card_write=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    sd_card_write=false;
                }

                break;

            case R.id.saveToFileButton:
                button = findViewById(R.id.saveToFileButton);

                if(file_write==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Zapis do pliku", Toast.LENGTH_SHORT);
                    toast.show();
                    file_write=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    file_write=false;
                }

                break;

            case R.id.readFromSdCardButton:
                button = findViewById(R.id.readFromSdCardButton);

                if(sd_card_read==false)
                {
                    button.setBackgroundColor(Color.GREEN);
                    button.setTextColor(Color.BLACK);
                    toast = Toast.makeText(MainActivity.this, "Odczyt z karty SD", Toast.LENGTH_SHORT);
                    toast.show();
                    sd_card_read=true;
                }
                else
                {
                    button.setBackgroundColor(Color.LTGRAY);
                    button.setTextColor(Color.BLACK);
                    sd_card_read=false;
                }

                break;

        }


    }
}
