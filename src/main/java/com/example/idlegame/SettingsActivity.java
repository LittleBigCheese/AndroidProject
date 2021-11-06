package com.example.idlegame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    long lastDown;
    long lastDuration;
    Button RandomButton;
    ImageButton settingsButton;

    //TextView boop;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        RandomButton = (Button) findViewById(R.id.button4);
/*
                settingsButton.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                            lastDown = System.currentTimeMillis();
                            //startActivity(new Intent(SettingsActivity.this, MainActivity.class));

                        } else if (event.getAction() == MotionEvent.ACTION_UP) {
                            lastDuration = System.currentTimeMillis() - lastDown;
                        }

                        return true;
                    }
                });
*/

        }
        //handler.post(new MyRunnable(handler, boop);
    }

