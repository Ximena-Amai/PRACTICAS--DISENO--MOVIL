package com.example.practica7imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView contenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedor = findViewById(R.id.ivA1imagen);
        Glide.with(this).load("https://i.pinimg.com/736x/74/41/2f/74412f8a46a0dd93553641fb9af9de1b.jpg").into(contenedor);
    }
}