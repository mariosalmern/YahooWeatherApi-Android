package com.example.trabajo.pruebasyahooapi.data;

import org.json.JSONObject;

/**
 * Created by trabajo on 17/05/2017.
 */

public class Item implements JSONPopulator {
    private Condition condition;

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
}
