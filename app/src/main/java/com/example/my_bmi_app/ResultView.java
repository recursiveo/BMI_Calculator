package com.example.my_bmi_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_view);
        Intent MainActivity = getIntent();
        TextView Calculated_BMI_value = (TextView) findViewById(R.id.BMIResultTextBox);
        Float bmi = MainActivity.getFloatExtra("bmi", 0);
        Calculated_BMI_value.setText(bmi.toString());
    }


}