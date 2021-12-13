package com.example.idlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;


public class DungeonActivity extends AppCompatActivity {
    long lastDown;
    long lastDuration;
    ImageButton dungeonStart;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dungeon);
        dungeonStart = (ImageButton) findViewById(R.id.imageButton2);
        dungeonStart.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown = System.currentTimeMillis();
                    //startActivity(new Intent(MainActivity.this, DungeonActivity.class));

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    lastDuration = System.currentTimeMillis() - lastDown;
                }
                //dungeonStart(new Intent(MainActivity.this, dungeonstart.class))
                return true;
            }
        });


    }
}
