package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>(); // = new ArrayList<>(100);
        list.add("Hello");
        Collections.addAll(list, "A", "R", "Hello", "foo");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.swap(list, 0, 3);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        list.add(2, "xxxxxxxxxx");
        System.out.println(list);

    }
}
