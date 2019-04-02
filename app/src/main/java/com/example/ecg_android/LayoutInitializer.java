package com.example.ecg_android;

import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class LayoutInitializer {

    public void doInit(View view) {
          Util_Button buttonsSettings;
//        buttonsSettings = Channel_3_ButtonController.getInstance().setOnClickAction();
//        buttonsSettings
//        buttonsSettings
//        buttonsSettings
//        buttonsSettings
//        buttonsSettings
//        buttonsSettings
//        buttonsSettings
     //   RunMeasurementButtonController button_measurment = new RunMeasurementButtonController();



 //       Toast toast = Toast.makeText(applicationContext, "Dzien dobry", Toast.LENGTH_SHORT)
  //      toast.show();

        //Do wyświetlania wykresu
        ChartController.getInstance().runChart(view);


        //Rzeczy do zapisywania
        String path= Environment.getExternalStorageDirectory().toString() + "/Damianek";
        String filename = "myfile";
        String stringg = "Hello world!";

        File folder = new File(path);
        folder.mkdirs();
        File file = new File(path+"/" + System.currentTimeMillis()+"txt");
        FileOutputStream fout;
        OutputStreamWriter m;

        try {

            fout = new FileOutputStream(file);
            m = new OutputStreamWriter(fout);
            m.append(stringg);
            m.close();
            fout.close();
        }
        catch (Exception e)
        {

        }

    }
}
