package com.sergeymedvedev.Mashup;

import twitter4j.JSONException;
import twitter4j.JSONObject;

import java.util.List;

public class Mashup {

    public static JSONObject toJSON (List<String> names, List<String> descriptions, List<String> tweets) throws JSONException {
        JSONObject result = new JSONObject();
        for (int i = 0; i < names.size(); i++) {
            JSONObject temp = new JSONObject();
            temp.put("name", names.get(i));
            temp.put("description", descriptions.get(i));
            temp.put("tweets", tweets.get(i));
            result.append("item", temp);
        }
        return result;
    }
}
