package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    public void addition (View v){
        Intent abcd = getIntent();
        String greeting = abcd.getStringExtra("username");
        String num1 = ((EditText)findViewById(R.id.firstdigit)).getText().toString();
        int number1 = Integer.parseInt(num1);
        String num2 = ((EditText)findViewById(R.id.seconddigit)).getText().toString();
        int number2 = Integer.parseInt(num2);
        int sum = number1 + number2;
        ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + sum);

    }

    public void subtraction (View v){
        Intent abcd = getIntent();
        String greeting = abcd.getStringExtra("username");
        String num1 = ((EditText)findViewById(R.id.firstdigit)).getText().toString();
        int number1 = Integer.parseInt(num1);
        String num2 = ((EditText)findViewById(R.id.seconddigit)).getText().toString();
        int number2 = Integer.parseInt(num2);
        int diff = number1 - number2;
        ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + diff);


    }

    public void multiplication (View v){
        Intent abcd = getIntent();
        String greeting = abcd.getStringExtra("username");
        String num1 = ((EditText)findViewById(R.id.firstdigit)).getText().toString();
        int number1 = Integer.parseInt(num1);
        String num2 = ((EditText)findViewById(R.id.seconddigit)).getText().toString();
        int number2 = Integer.parseInt(num2);
        int prod = number1 * number2;
        ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + prod);


    }

    public void division (View v){
        Intent abcd = getIntent();
        String greeting = abcd.getStringExtra("username");
        String num1 = ((EditText)findViewById(R.id.firstdigit)).getText().toString();
        int number1 = Integer.parseInt(num1);
        String num2 = ((EditText)findViewById(R.id.seconddigit)).getText().toString();
        int number2 = Integer.parseInt(num2);
        int quot = number1 / number2;
        ((TextView)findViewById(R.id.answer)).setText(greeting + ", answer is: " + quot);

    }

    public void reset (View v){
        ((TextView)findViewById(R.id.firstdigit)).setText("");
        ((TextView)findViewById(R.id.seconddigit)).setText("");
        ((TextView)findViewById(R.id.answer)).setText("");
    }
}