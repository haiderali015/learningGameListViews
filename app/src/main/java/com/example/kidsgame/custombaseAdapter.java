package com.example.kidsgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custombaseAdapter extends BaseAdapter {

    Context context;
    String [] listFruit;
    int[] ListImages;
    LayoutInflater inflater;

    public custombaseAdapter(Context ctx, String [] fruitList, int[] images)
    {
        this.context=ctx;
        this.listFruit=fruitList;
        this.ListImages=images;
        inflater=LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listFruit.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtview=(TextView) convertView.findViewById(R.id.textview);
        txtview.setText(listFruit[position]);
        ImageView fruitimg= (ImageView) convertView.findViewById(R.id.imageIcon);
        fruitimg.setImageResource(ListImages[position]);
        return convertView;
    }
}
