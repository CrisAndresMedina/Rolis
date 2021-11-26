package com.example.rolis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity : AppCompatActivity()    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setSupportActionBar(findViewById(R.id.my_toolbar))
    }
}