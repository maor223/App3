package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    ImageView iv;
    Switch sw;
    SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);
        sw = findViewById(R.id.st);
        sb = findViewById(R.id.sb);

        sw.setOnCheckedChangeListener(this);
        sb.setOnSeekBarChangeListener(this);
        sb.setMax(100);
        sb.setProgress(100);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView==sw){
            if(isChecked){
                iv.setVisibility(View.VISIBLE);
            }
            else{
                iv.setVisibility(View.INVISIBLE);
            }
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(seekBar==sb){
            float alpha = (float)progress/100;
            iv.setAlpha(alpha);
        }


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
