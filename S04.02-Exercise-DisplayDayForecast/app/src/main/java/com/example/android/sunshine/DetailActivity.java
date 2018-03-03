package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherDetailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent startedBy = getIntent();

        if (startedBy.hasExtra(Intent.EXTRA_TEXT)) {
            mWeatherDetailsTextView = (TextView) findViewById(R.id.weather_details);
            mWeatherDetailsTextView.setText(startedBy.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}