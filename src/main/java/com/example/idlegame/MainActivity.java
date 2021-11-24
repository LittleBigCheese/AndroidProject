package com.example.idlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Handler;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    long lastDown;
    long lastDuration;
    TextView moneyText;
    TextView punchingBagText;
    Button punchingBagButton, swordButton, shieldButton;
    ImageButton settingsButton;
    ImageButton dungeonButton;
    BasicIdleCounter punchingBag = new BasicIdleCounter();
    int numPunchingBags = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = (TextView) findViewById(R.id.textView);
        punchingBagText = (TextView) findViewById(R.id.textView3);
        punchingBagButton = (Button) findViewById(R.id.button);
        swordButton = (Button) findViewById(R.id.button2);
        shieldButton = (Button) findViewById(R.id.button3);
        settingsButton = (ImageButton) findViewById(R.id.imageButton);
        dungeonButton = (ImageButton) findViewById(R.id.imageButton3);
        final Handler handler = new Handler();
        class MyRunnable implements Runnable {
            private Handler handler;
            private TextView textView;
            public MyRunnable(Handler handler, TextView textView) {
                this.handler = handler;
                this.textView = textView;
            }
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void run() {
                this.handler.postDelayed(this, 1000);
                punchingBag.setIncrement(numPunchingBags);
                 punchingBag.incrementMoney();
                MainActivity.this.moneyText.setText(String.format("%s", "Money: " + punchingBag.getMoney()));
                punchingBagButton.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                            lastDown = System.currentTimeMillis();
                            numPunchingBags++;
                            MainActivity.this.punchingBagText.setText(String.format("%s", "Num of Punching Bags: " + numPunchingBags));
                        } else if (event.getAction() == MotionEvent.ACTION_UP) {
                            lastDuration = System.currentTimeMillis() - lastDown;
                        }

                        return true;
                    }
                });
                swordButton.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                            lastDown = System.currentTimeMillis();
                            punchingBag.incrementAttack();
                        } else if (event.getAction() == MotionEvent.ACTION_UP) {
                            lastDuration = System.currentTimeMillis() - lastDown;
                        }

                        return true;
                    }
                });
                shieldButton.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                            lastDown = System.currentTimeMillis();
                            punchingBag.incrementDefense();
                        } else if (event.getAction() == MotionEvent.ACTION_UP) {
                            lastDuration = System.currentTimeMillis() - lastDown;
                        }

                        return true;
                    }
                });
                settingsButton.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                            lastDown = System.currentTimeMillis();
                            startActivity(new Intent(MainActivity.this, SettingsActivity.class));

                        } else if (event.getAction() == MotionEvent.ACTION_UP) {
                            lastDuration = System.currentTimeMillis() - lastDown;
                        }

                        return true;
                    }
                });

                dungeonButton.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                            lastDown = System.currentTimeMillis();
                            startActivity(new Intent(MainActivity.this, DungeonActivity.class));

                        } else if (event.getAction() == MotionEvent.ACTION_UP) {
                            lastDuration = System.currentTimeMillis() - lastDown;
                        }

                        return true;
                    }
                });
            }

        }
        handler.post(new MyRunnable(handler, moneyText));
    }
}