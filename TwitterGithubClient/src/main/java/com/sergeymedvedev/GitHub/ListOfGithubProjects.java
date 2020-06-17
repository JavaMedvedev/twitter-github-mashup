package com.sergeymedvedev.GitHub;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class ListOfGithubProjects {

    public static List<GithubProject> listOfGithubProjects(String key) throws IOException {

        String GITHUB_API_URL = "https://api.github.com/search/repositories?q=" + key;
        URL url = new URL (GITHUB_API_URL);
        InputStreamReader reader = new InputStreamReader(url.openStream());
        Gson gson = new Gson();
        GithubResponse response = gson.fromJson(reader, GithubResponse.class);
        List<GithubProject> listOfGithubProjects = response.GithubResponse();

        return listOfGithubProjects;
    }
}
