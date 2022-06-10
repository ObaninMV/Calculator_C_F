package com.example.controlwork13may;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText firstNum = findViewById(R.id.Number);

        int num = Integer.parseInt(firstNum.getText().toString());

        int d = 32;
        double result;
        double b = 1.8;
        result = (num * b) + d;

        TextView outputNum = findViewById(R.id.output);
        firstNum.setText(Double.toString(result));
    }

    public void convert2(View view) {
        EditText firstNum = findViewById(R.id.Number2);

        int num = Integer.parseInt(firstNum.getText().toString());

        int d = 32;
        double result;
        double b = 1.8;
        result = (num - d) / b;

        TextView outputNum = findViewById(R.id.output2);
        firstNum.setText(Double.toString(result));
    }
}