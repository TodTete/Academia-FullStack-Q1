package com.bootcamp.week2;

public class SM{
    public static void main(String[] args){
        int x = 10, y = 20;
        int dx, dy;
        try{
            dx = 10 % 5;
            dy =  20/dx;
        }catch(ArithmeticException ae){
            System.out.println("Caught AE");
            dx = 2;
            dy = 20/2;  //10
        }
        x = 10/2;
        y = 20/10;
        System.out.println(dx+" "+dy);
        System.out.println(x+" "+y);



    }
}