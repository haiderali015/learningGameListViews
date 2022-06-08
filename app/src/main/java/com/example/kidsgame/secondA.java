package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class secondA extends AppCompatActivity {
    ListView lv;
    String []name={"A for Apple","B for Banana","C for Cat","D for Dog","E for Egg","F for Fish","G for Glue"};

    Integer[]img={R.drawable.apple,R.drawable.banana,R.drawable.cat,R.drawable.dog,R.drawable.egg,R.drawable.fish};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }
}