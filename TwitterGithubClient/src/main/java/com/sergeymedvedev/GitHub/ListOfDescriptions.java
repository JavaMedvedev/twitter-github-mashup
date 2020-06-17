package com.sergeymedvedev.GitHub;

import java.util.ArrayList;
import java.util.List;

public class ListOfDescriptions {

    static List<String> listOfDescriptions = new ArrayList();

    public static List<String> ListBuilder(List<GithubProject> list) {

        for (int i = 0; i < list.size(); i++) {
            listOfDescriptions.add(list.get(i).description);
        }

        return listOfDescriptions;
    }
}
