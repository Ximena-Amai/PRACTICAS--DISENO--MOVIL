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
        Glide.with(this).load("https://i.pinimg.com/736x/5b/bd/3e/5bbd3ed60f96884c67d1dce2921b0da4.jpg").into(contenedor);
    }
}