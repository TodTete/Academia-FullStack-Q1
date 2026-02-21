package com.bootcamp.week2;

public class SM{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = x++; // 0
        int a = --y; // 1 a
        int b = z--; // 1 b y cambio el valor de z a 0
        b += ++z;    // 2
        System.out.println(b);
        int answ = x>a?y>b? y:b:x>z?x:z;

        System.out.println(answ);
    }
}