package com.sergeymedvedev.Twitter;

import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

public class ListOfTweets extends TwitterAPI {

    public static List<String> listOfTweets(List<String> listOfNames) throws TwitterException {

        List<String> listOfTweets = new ArrayList<>();

        int i = 0;
        for (String githubName : listOfNames) {
            Query query = new Query(githubName);
            QueryResult queryResult = TwitterAPI.tweets().search(query);

            List<Status> queryResultTweets = queryResult.getTweets();

            JSONArray temp = new JSONArray();
            for (Status tweet : queryResultTweets) {
                temp.put(tweet.getText());
            }
            listOfTweets.add(i, temp.toString());
            i++;
        }

        return listOfTweets;
    }
}
