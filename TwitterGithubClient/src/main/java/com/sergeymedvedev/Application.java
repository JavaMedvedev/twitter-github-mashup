package com.sergeymedvedev;

import com.sergeymedvedev.GitHub.*;
import com.sergeymedvedev.Mashup.Mashup;
import com.sergeymedvedev.Twitter.ListOfTweets;
import twitter4j.*;

import java.io.IOException;
import java.util.List;

public class Application {

    public static String key = "reactive";

    public static void main(String[] args) throws IOException, TwitterException, JSONException {

        if (args[0].isBlank() == false) {
            key = args[0];
        };

        //Making list of GiHub projects from PoJo
        List<GithubProject> listOfProjects = ListOfGithubProjects.listOfGithubProjects(key);

        //Making lists of GiHub names and descriptions from list of GiHub projects
        List<String> listOfNames = ListOfNames.ListBuilder(listOfProjects);
        List<String> listOfDescriptions = ListOfDescriptions.ListBuilder(listOfProjects);

        //Making list of tweets from list of Github names
        List<String> listOfTweets = ListOfTweets.listOfTweets(listOfNames);

        //Making JSON Object of Github names, Github descriptions and Twitter tweets
        JSONObject result = Mashup.toJSON(listOfNames, listOfDescriptions, listOfTweets);
        System.out.println(result);
    }
}
