package com.example.trabajo.pruebasyahooapi.data;

import org.json.JSONObject;

/**
 * Created by trabajo on 17/05/2017.
 */

public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");

    }
}
