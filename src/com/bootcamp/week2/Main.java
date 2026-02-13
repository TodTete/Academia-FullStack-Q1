package com.bootcamp.week2;

public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        a = a + " World";
        System.out.println(a);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());
    }
    
}

