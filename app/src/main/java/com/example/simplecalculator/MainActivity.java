package com.example.simplecalculator;

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
        setTitle("Home");

    }

    public void nextactivity (View v)
    {
        final EditText edit_uname = findViewById(R.id.username);
        DBUser userc = new DBUser();
        String user = ((EditText)findViewById(R.id.username)).getText().toString();
        if (user.length() != 0) {
            Intent abcd = new Intent(this, Calculator.class);
            abcd.putExtra("username", user);
            UserName name = new UserName(user);
            userc.add(name);
            startActivity(abcd);
        }
        else
        {
            Toast.makeText(this,"Name cannot be empty", Toast.LENGTH_SHORT).show();
        }
    }
}