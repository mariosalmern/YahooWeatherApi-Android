package com.example.trabajo.pruebasyahooapi.service;

import android.os.AsyncTask;

/**
 * Created by trabajo on 17/05/2017.
 */

public class YahooWeatherService {

    private WeatherServiceCallBack callBack;
    private String location;

    public YahooWeatherService(WeatherServiceCallBack callBack) {
        this.callBack = callBack;
    }
    public void refreshWeather(String location){
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... params) {
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }
        }.execute(location);

    }


}
