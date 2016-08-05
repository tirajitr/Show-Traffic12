package com.appgood.mastera.showtraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView iconimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        iconimageView = (ImageView) findViewById(R.id.imageView2);

        //Receive from Intent
        String strTitle = getIntent().getStringExtra("Title");
        String strDetail = getIntent().getStringExtra("Detail");
        int intIcon = getIntent().getIntExtra("icon", R.drawable.traffic_01);

        //Show View
        titleTextView.setText(strTitle);
        detailTextView.setText(strDetail);
        iconimageView.setImageResource(intIcon);

    }   // Main Method

    public void clickBack(View view) {
        finish();
    }

}   // Main Class
