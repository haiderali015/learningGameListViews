package com.example.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class secondA extends MainActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lv=findViewById(R.id.lv);

        String []name={"A for Apple","B for Banana","C for Cat","D for dog","E for Egg","F for fish","G for Glue","H for Hat","I for Ice","J for Jug","K for Key","L for Lion","M for Monkey","N for Nose","O for Orange","P for Pen","Q for Quack","R for Rabbit","S for Star","T for Ten","U for Umbrella","V for Van","W for Whale","X for Xray","Y for Yogurt","Z for Zebra"};
        Integer[]img={R.drawable.apple,R.drawable.banana,R.drawable.cat,R.drawable.dog,R.drawable.egg,R.drawable.fish,R.drawable.glue,R.drawable.hat,R.drawable.ice,R.drawable.jug,R.drawable.key,R.drawable.lion,R.drawable.monkey,R.drawable.nose,R.drawable.orange,R.drawable.pen,R.drawable.quack,R.drawable.rabbit,R.drawable.star,R.drawable.ten,R.drawable.umbrella,R.drawable.van,R.drawable.whale,R.drawable.xray,R.drawable.yogurt,R.drawable.zebra};

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

        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.customlist, null,true);

            TextView titleText = (TextView) rowView.findViewById(R.id.title);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

            titleText.setText(name[position]);
            imageView.setImageResource(img[position]);

            return rowView;

        };
    }

}