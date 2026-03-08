package com.bootcamp.week4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add(123);
        list.add(3.14);

        list.forEach(System.out::println);
    }
}
