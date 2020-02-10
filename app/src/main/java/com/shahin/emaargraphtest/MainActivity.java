package com.shahin.emaargraphtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.anastr.speedviewlib.Speedometer;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Speedometer speedometer = findViewById(R.id.speedView);
        int speed = 30;

        speedometer.setMaxSpeed(100);
        speedometer.speedTo(100);
        speedometer.setIndicatorColor(R.color.speed_min_color);
        speedometer.setMarkColor(R.color.transparent);


        if (speed >= 35) {
            speedometer.setLowSpeedColor(R.color.speed_min_color);

        } else if (speed >= 55) {
            speedometer.setMediumSpeedColor(R.color.speed_mid_color);


        } else if (speed >= 75) {
            speedometer.setHighSpeedColor(R.color.speed_max_color);


        }
    }
}
