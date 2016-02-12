package app.com.example.montse_i_xavi.sunshinetest6;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.com.example.montse_i_xavi.sunshinetest6.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> mForecastAdapter;

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        //Create a String list
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Sunny - 80/68"
        };
        List<String> weekforecast = new ArrayList<String>(
                Arrays.asList(forecastArray));



        // Ara que ja tenim les dades de la nostra tonta previsió del temps, creem un ArrayAdapter
        // L'ArrayAdapter agafa les dades de la font(igual que la nostra tonta previsió del temps) i
        // l'utilitza per omplir la ListView a la que està adjunta
        mForecastAdapter = new ArrayAdapter<String>(
                //el context actual (this fragment's parent activity)
                getActivity(),
                //ID of list item layout
                R.layout.list_item_forecast,
                //ID of the textview to populate
                R.id.listview_forecast,
                //forecast data
                weekforecast);


        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;

    }
}