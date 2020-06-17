package com.sergeymedvedev.GitHub;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {

    static List<String> listOfNames = new ArrayList();

    public static List<String> ListBuilder(List<GithubProject> list) {

        for (int i = 0; i < list.size(); i++) {
            listOfNames.add(list.get(i).name);
        }

        return listOfNames;
    }
}
