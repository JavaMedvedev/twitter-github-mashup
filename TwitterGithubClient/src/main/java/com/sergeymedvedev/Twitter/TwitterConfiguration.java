package com.sergeymedvedev.Twitter;

import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfiguration {

    public static ConfigurationBuilder TwitterConfiguration() {

        ConfigurationBuilder builder = new ConfigurationBuilder();

        builder.setDebugEnabled(true)
                .setOAuthConsumerKey("*****************************")
                .setOAuthConsumerSecret("*****************************")
                .setOAuthAccessToken("*****************************")
                .setOAuthAccessTokenSecret("*****************************");

        return builder;
    }
}
