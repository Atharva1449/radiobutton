package com.theonedayapps.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radiogrp;
    private RadioButton radiobbtn;
    private RadioGroup radiogrp1;
    private RadioButton radiobbtn1;
    private TextView text;
    private String status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.textView2);


        radiogrp=(RadioGroup)findViewById(R.id.radiogroupid);
        radiogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radiobbtn=(RadioButton)findViewById(checkedId);
                switch(checkedId){
                    case R.id.radiobuttonyes: {
                        status="poly";
//                        text.setText(status);
//                        text.setVisibility(1);

                    }
                    break;
                    case R.id.radiobuttonmaybe: {
                        status="mba";
//                    text.setText(status);
//                    text.setVisibility(1);

                }
                break;
                    case R.id.radiobuttonno: {
                        status="zcoer";
//                   text.setText(status);
//                    text.setVisibility(1);

                }
                    break;
                }
            }
        });


        //

        radiogrp1=(RadioGroup)findViewById(R.id.radiogroupid2);
        radiogrp1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radiobbtn=(RadioButton)findViewById(checkedId);
                switch(checkedId){
                    case R.id.a1: {
                        status=status+" fy";
                        text.setText(status);
                        text.setVisibility(1);

                    }
                    break;
                    case R.id.a2: {
                        status=status+" avai";
                        text.setText(status);
                        text.setVisibility(1);

                    }
                    break;
                    case R.id.a3: {
                        status=status+" dsc";
                        text.setText(status);
                        text.setVisibility(1);

                    }
                    break;
                }
            }
        });


    }
}
