package com.example.ecg_android;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConnectionButtonController extends AppCompatActivity implements Util_Button {
    private final static Util_Button instance = new ConnectionButtonController();
    private final Button instanceButton;
    private final static int BUTTON_NAME = R.id.connectButton;
    private ConnectionButtonController(){
        instanceButton = findViewById(BUTTON_NAME);
    }
    public Util_Button getInstance(){
        return instance;
    }
    public void setOnClickAction(){
        instanceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                final CharSequence text = "Connect Button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);

                instanceButton.setBackgroundColor(Color.BLACK);
                instanceButton.setTextColor(Color.BLACK);

                toast.show();
            }
        });
    }

    public Button getButton(){
        return instanceButton;
    }
}
