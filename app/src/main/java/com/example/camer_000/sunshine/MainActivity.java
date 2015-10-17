package com.example.camer_000.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] forecastArray = {
                "Today - Sunny - 88/76",
                "Tomorrow - Sunny - 89/82",
                "Wednesday - Cloudy - 78/73",
                "Thursday - Sunny - 88/79",
                "Friday - Rainy - 80/76",
                "Saturday - Snowy - 31/16",
                "Sunday - Sunny - 95/83"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, forecastArray);

        ListView view = (ListView) findViewById(R.id.forecast_listview);
        view.setAdapter(adapter);
    }
}
