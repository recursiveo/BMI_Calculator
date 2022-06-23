package com.example.my_bmi_app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BMICalculator(View view) {
        float weight, height, bmi;
        EditText WField, HField;
        WField = (EditText) findViewById(R.id.weight);
        HField = (EditText) findViewById(R.id.height);

        if(WField.getText().toString().matches("") || HField.getText().toString().matches("")){
            Toast.makeText(this, "Height or Weight not entered", Toast.LENGTH_LONG).show();
            return;
        }

        weight = Float.parseFloat(WField.getText().toString());
        height = Float.parseFloat(HField.getText().toString());
        if(weight <=0 || height <=0 ){
            Toast.makeText(this, "Please enter real values for height and weight", Toast.LENGTH_LONG).show();
            return;
        }else{
            bmi = (weight / height / height) * 10000;
        }

        Intent BMIResultActivity = new Intent(this, ResultView.class);
        BMIResultActivity.putExtra("bmi", bmi);
        startActivity(BMIResultActivity);
    }
}