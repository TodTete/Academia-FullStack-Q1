package com.bootcamp.week2.Ejercicios.bank_1;

public class InsufficientBalanceException extends Exception{
    private final double deficit;

    public InsufficientBalanceException(String mesage,double deficit) {
        super(mesage);
        this.deficit = deficit;
    }

    public double getDeficit() { return deficit; }
}