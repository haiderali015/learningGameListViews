package com.example.kidsgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class custombaseAdapter extends BaseAdapter {

    Context ctx;
    String [] listFruit;
    int[] ListImages;
    LayoutInflater inflater;

    public custombaseAdapter(Context ctx, String [] fruitList, int[] images)
    {

    }
    @Override
    public int getCount() {
        return 0;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
