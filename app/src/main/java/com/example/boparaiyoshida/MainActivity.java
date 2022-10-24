package com.example.boparaiyoshida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Massaman, Neapolitan, Chocolate, Sushi, Peking , Hamburger, Penang , Tom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Massaman = findViewById(R.id.Massaman);
        Neapolitan = findViewById(R.id.Neapolitan);
        Chocolate = findViewById(R.id.Chocolate);
        Sushi = findViewById(R.id.Sushi);
        Peking = findViewById(R.id.Peking);
        Hamburger =  findViewById(R.id.Hamburger);
        Penang = findViewById(R.id.Penang);
        Tom = findViewById(R.id.Tom);

        Massaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Massaman.class);
                startActivity(intent);

            }
        });

        Neapolitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Neapolitan.class);
                startActivity(intent);

            }
        });

        Chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Chocolate.class);
                startActivity(intent);

            }
        });

        Penang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Penang.class);
                startActivity(intent);

            }
        });

        Sushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Sushi.class);
                startActivity(intent);

            }
        });

        Peking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Peking.class);
                startActivity(intent);

            }
        });

        Hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Hamburger.class);
                startActivity(intent);

            }
        });

        Tom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Tom.class);
                startActivity(intent);

            }
        });
    }

}