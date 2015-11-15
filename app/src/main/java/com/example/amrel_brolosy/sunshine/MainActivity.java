package com.example.amrel_brolosy.sunshine;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null){
//            getSupportFragmentManager().beginTransaction().add(R.id.fragment , new  placeholerFragment()).commit();
        }






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //placeholder Class
    public static class placeholerFragment extends Fragment{
        public placeholerFragment(){

        }
        public View onCreateView(LayoutInflater inflater , ViewGroup container,Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);


            String [] forecastArray = {
                    "Sun - Rainy - 88/51",
                    "Mon - Rainy - 81/52",
                    "Tus - Rainy - 82/53",
                    "Wesd - Rainy - 83/54",
                    "Thu - Rainy - 84/55",
                    "Fri - Rainy - 85/56",
                    "Sat - Rainy - 86/57","Sun - Rainy - 88/51",
                    "Mon - Rainy - 81/52",
                    "Tus - Rainy - 82/53",
                    "Wesd - Rainy - 83/54",
                    "Thu - Rainy - 84/55",
                    "Fri - Rainy - 85/56",
                    "Sat - Rainy - 86/57","Sun - Rainy - 88/51",
                    "Mon - Rainy - 81/52",
                    "Tus - Rainy - 82/53",
                    "Wesd - Rainy - 83/54",
                    "Thu - Rainy - 84/55",
                    "Fri - Rainy - 85/56",
                    "Sat - Rainy - 86/57","Sun - Rainy - 88/51",
                    "Mon - Rainy - 81/52",
                    "Tus - Rainy - 82/53",
                    "Wesd - Rainy - 83/54",
                    "Thu - Rainy - 84/55",
                    "Fri - Rainy - 85/56",
                    "Sat - Rainy - 86/57","Sun - Rainy - 88/51",
                    "Mon - Rainy - 81/52",
                    "Tus - Rainy - 82/53",
                    "Wesd - Rainy - 83/54",
                    "Thu - Rainy - 84/55",
                    "Fri - Rainy - 85/56",
                    "Sat - Rainy - 86/57"
            };

            List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

            ArrayAdapter mForecastAdapter = new ArrayAdapter<String>(getActivity() ,
                    R.layout.list_item_forecast,
                    R.id.list_item_forecast_textview,
                    weekForecast);
            ListView listView = (ListView)rootView.findViewById(R.id.listview_forecats);
            listView.setAdapter(mForecastAdapter);


            return rootView;
        }


    }

}

