package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Swap {

    public static void swap(HashMap<Integer, String> testHM) {
        HashMap<String, Integer> resultHM = new HashMap<>();

        List<Integer> keys = new ArrayList<>(testHM.keySet());
        List<String> values = new ArrayList<>(testHM.values());

        for (int i = 0; i < keys.size(); i++) {
            resultHM.put(values.get(i), keys.get(i));
        }
        System.out.println(resultHM);
    }
}

