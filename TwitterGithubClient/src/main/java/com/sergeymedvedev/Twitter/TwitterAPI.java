package com.sergeymedvedev.Twitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class TwitterAPI extends TwitterConfiguration {

    public static Twitter tweets() {

        Twitter tweets = new TwitterFactory(TwitterConfiguration().build()).getInstance();

        return tweets;
    }
}
