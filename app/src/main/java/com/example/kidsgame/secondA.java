package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class secondA extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        String []name={"Facebook","Instagram"};
        Integer[]img={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};

        MyListAdapter adapter=new MyListAdapter(this, name,img);
        lv.setAdapter(adapter);

    }
    public class MyListAdapter extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] name;
        private final Integer[] img;

        public MyListAdapter(Activity context, String[] name,Integer[] img) {
            super(context, R.layout.customlist, name);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.img = img;
            this.name=name;
        }
}