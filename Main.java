package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap testHM = new HashMap();
        testHM.put(1, "Булгаков");
        testHM.put(2, "Гоголь");
        testHM.put(4, "Железняк");
        testHM.put(3, "Есенин");
        testHM.put(5, "Пушкин");

        System.out.println(testHM);

        Swap swap = new Swap();
        swap.swap(testHM);

        RandomList rl = new RandomList();
        int sizeList = 10000000;
        ArrayList arrey = rl.createRandomAL(sizeList);
        LinkedList linked = rl.createRandomLL(sizeList);
        int index = 65000;

        long startTime = System.nanoTime();
        System.out.println("Элемент ArrayList с индексом " + index + " -> " + arrey.get(index));
        long endTime = System.nanoTime();
        System.out.println("Время обращения к элементу ArrayList = " + (endTime-startTime/1000000000.0 + " секунд"));

        startTime = System.nanoTime();
        System.out.println("Элемент LinkedList с индексом " + index + " -> " + linked.get(index));
        endTime = System.nanoTime();
        System.out.println("Время обращения к элементу LinkedList = " + (endTime-startTime/1000000000.0 + " секунд"));

        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("Колобок");
        arrayListString.add("Курочка Ряба");
        arrayListString.add("Муму");
        arrayListString.add("Буратино");
        arrayListString.add("Буратино");
        arrayListString.add("Пинокио");
        arrayListString.add("Колобок");

        System.out.println("Изначальный ArrayList -> " + arrayListString);
        HashSet hashSet = new HashSet<>(arrayListString);
        System.out.println("Изначальный ArrayList -> " + hashSet);
    }
}