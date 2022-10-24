package com.example.boparaiyoshida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Hamburger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger);
        getSupportActionBar().hide();
    }
}