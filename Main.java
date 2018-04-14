package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

       // String text = map.get(1);
       // System.out.println(text);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("\nKey " + key + " is for value " + value);
            System.out.println();
        }

        }
    }

