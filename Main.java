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
        int sizeList = 1_000_000;
        ArrayList array = rl.createRandomAL(sizeList);
        LinkedList linked = rl.createRandomLL(sizeList);
        Random rm = new Random();


        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int index = rm.nextInt(1_000_000);
            array.get(index);
        }
        long endTime = System.nanoTime();
        System.out.println("\nВремя обращения к элементу ArrayList = " + (endTime-startTime/1000000000.0 + " секунд"));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000 ; i++) {
            int index = rm.nextInt(1_000_000);
            linked.get(index);
        }
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

        System.out.println("\nИзначальный ArrayList -> " + arrayListString);
        HashSet hashSet = new HashSet<>(arrayListString);
        System.out.println("Без дубликтов -> " + hashSet);
    }
}