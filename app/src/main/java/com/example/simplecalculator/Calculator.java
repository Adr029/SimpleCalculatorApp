package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Intent abcd = getIntent();
        String greeting = abcd.getStringExtra("username");
        ((TextView)findViewById(R.id.welcome)).setText("WELCOME, " + greeting);
    }

    int operation = 0;

    public void addition (View v){
        operation = 1;
        findViewById(R.id.plus).setEnabled(false);
        findViewById(R.id.minus).setEnabled(true);
        findViewById(R.id.multiply).setEnabled(true);
        findViewById(R.id.divide).setEnabled(true);
    }

    public void subtraction (View v){
        operation = 2;
        findViewById(R.id.plus).setEnabled(true);
        findViewById(R.id.minus).setEnabled(false);
        findViewById(R.id.multiply).setEnabled(true);
        findViewById(R.id.divide).setEnabled(true);
    }

    public void multiplication (View v){
        operation = 3;
        findViewById(R.id.plus).setEnabled(true);
        findViewById(R.id.minus).setEnabled(true);
        findViewById(R.id.multiply).setEnabled(false);
        findViewById(R.id.divide).setEnabled(true);
    }

    public void division (View v){
        operation = 4;
        findViewById(R.id.plus).setEnabled(true);
        findViewById(R.id.minus).setEnabled(true);
        findViewById(R.id.multiply).setEnabled(true);
        findViewById(R.id.divide).setEnabled(false);
    }

    public void reset (View v){
        ((TextView)findViewById(R.id.firstdigit)).setText("");
        ((TextView)findViewById(R.id.seconddigit)).setText("");
        ((TextView)findViewById(R.id.answer)).setText("");
        findViewById(R.id.buttonbianx).setEnabled(true);
        ((Button)findViewById(R.id.buttonbianx)).setText("PINK");
        ((Button)findViewById(R.id.buttonbianx)).setBackgroundColor(Color.parseColor("#E91E63"));
    }

    public void disable (View v)
    {
        findViewById(R.id.buttonbianx).setEnabled(false);
        ((Button)findViewById(R.id.buttonbianx)).setText("BLUE");
        ((Button)findViewById(R.id.buttonbianx)).setBackgroundColor(Color.parseColor("#0000FF"));
    }

    public void compute (View v)
    {
        Intent abcd = getIntent();
        String greeting = abcd.getStringExtra("username");
        String num1 = ((EditText)findViewById(R.id.firstdigit)).getText().toString();
        float number1 = Float.parseFloat(num1);
        String num2 = ((EditText)findViewById(R.id.seconddigit)).getText().toString();
        float number2 = Float.parseFloat(num2);

    switch (operation)
    {
        case 0:
            Toast.makeText(this,"Please select operation", Toast.LENGTH_SHORT).show();
        case 1:
            float sum = number1 + number2;
            ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + sum);
            break;
        case 2:
            float diff = number1 - number2;
            ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + diff);
            break;
        case 3:
            float prod = number1 * number2;
            ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + Math.abs(prod));
            break;
        case 4:
            float quot = number1 / number2;
            ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + quot);
            break;
    }
    }
}