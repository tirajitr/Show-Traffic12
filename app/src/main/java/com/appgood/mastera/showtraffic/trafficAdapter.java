package com.appgood.mastera.showtraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ibook on 5/8/2559.
 */
public class trafficAdapter extends BaseAdapter{

    //Eplicit
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;

    //Create Constructor


    public trafficAdapter(Context context,
                          int[] iconInts,
                          String[] titleStrings,
                          String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Open Service
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        //Blind Widget
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);

        //Show View
        iconImageView.setImageResource(iconInts[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);


        return view1;
    }
} // Main Class
