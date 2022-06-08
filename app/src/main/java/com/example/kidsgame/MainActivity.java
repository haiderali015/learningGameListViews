package com.example.kidsgame;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String []name={"A for Apple","B for Banana","C for Cat","D for Dog","E for Egg","F for Fish","G for Glue"};

    Integer[]img={R.drawable.apple,R.drawable.banana,R.drawable.cat,R.drawable.dog,R.drawable.egg,R.drawable.fish};

    Button btn,btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        String []name={"Facebook","Instagram"};
        Integer[]img={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};

        MyListAdapter adapter=new MyListAdapter(this, name,img);
        lv.setAdapter(adapter);
        btn=findViewById(R.id.learn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),secondA.class);
                startActivity(i);

            }
        });

       /* btn1=findViewById(R.id.repository);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/haiderali015/javadailywork");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });

        btn2=findViewById(R.id.exam);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),fourthA.class);
                startActivity(i);

            }
        });*/


    }

    public class MyListAdapter extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] name;
        private final Integer[] img;

        public MyListAdapter(Activity context, String[] name,Integer[] img) {
            super(context, R.layout.activity_second, name);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.img = img;
            this.name=name;
        }
}