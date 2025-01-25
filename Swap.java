package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Swap {

    public static void swap(HashMap<Integer, String> testHM) {
        HashMap resultHM = new HashMap();

        List<Integer> key = new ArrayList<>(testHM.keySet());
        List<String> value = new ArrayList<>(testHM.values());

        for (int i = 0; i < key.size(); i++) {
            resultHM.put(value.get(i), key.get(i));
        }
        System.out.println(resultHM);
    }
}

