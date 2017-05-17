package com.example.trabajo.pruebasyahooapi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabajo.pruebasyahooapi.data.Channel;
import com.example.trabajo.pruebasyahooapi.service.WeatherServiceCallBack;
import com.example.trabajo.pruebasyahooapi.service.YahooWeatherService;

public class WeatherActivity extends Activity implements WeatherServiceCallBack {


    private ImageView weatherIconImageView;
    private TextView temperatureTextView;
    private TextView conditionTextView;
    private TextView locationTextView;

    private YahooWeatherService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherIconImageView = (ImageView)findViewById(R.id.weatherIconImageView);
        temperatureTextView = (TextView)findViewById(R.id.temperatureTextView);
        conditionTextView = (TextView)findViewById(R.id.conditionTextView);
        locationTextView = (TextView)findViewById(R.id.locationTextView);

        service = new YahooWeatherService(this);
        service.refreshWeather("Ciudad Real, ES");

    }

    @Override
    public void serviceSuccess(Channel channel) {

    }

    @Override
    public void serviceFailure(Exception exception) {
        Toast.makeText(this, exception.getMessage(), Toast.LENGTH_LONG).show();

    }
}
