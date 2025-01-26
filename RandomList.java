package org.example;

import java.util.*;

public class RandomList {
    public static ArrayList<Integer> createRandomAL(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt());
        }
        return arrayList;
    }

    public static LinkedList<Integer> createRandomLL(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt());
        }
        return linkedList;
    }
}
