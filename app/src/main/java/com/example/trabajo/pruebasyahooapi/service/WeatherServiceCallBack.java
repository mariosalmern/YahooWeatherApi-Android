package com.example.trabajo.pruebasyahooapi.service;

import com.example.trabajo.pruebasyahooapi.data.Channel;

/**
 * Created by trabajo on 17/05/2017.
 */

public interface WeatherServiceCallBack {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
