package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secondA extends AppCompatActivity {

    String fruitList [] ={"apple","banana","cat","dog","egg","fish"};
    int fruitImages [] ={R.drawable.apple,R.drawable.banana,R.drawable.cat,R.drawable.dog,R.drawable.egg,R.drawable.fish};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}