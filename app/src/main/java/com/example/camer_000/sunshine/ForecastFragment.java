package com.example.camer_000.sunshine;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by camer_000 on 10/17/2015.
 * Donnknow what this does either.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances) {
        String[] forecastArray = {
                "Today - Sunny - 88/76",
                "Tomorrow - Sunny - 89/82",
                "Wednesday - Cloudy - 78/73",
                "Thursday - Sunny - 88/79",
                "Friday - Rainy - 80/76",
                "Saturday - Snowy - 31/16",
                "Sunday - Sunny - 95/83"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                //Context
                getActivity(),
                //How it should look
                R.layout.list_item_forecast,
                //Where it goes
                R.id.list_item_forecast_textview,
                //Where data is being pulled from
                forecastArray);

        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        ListView view = (ListView) rootView.findViewById(R.id.forecast_listview);
        view.setAdapter(adapter);

        return rootView;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle item selection
        switch (item.getItemId()) {
            case R.id.action_refresh:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
