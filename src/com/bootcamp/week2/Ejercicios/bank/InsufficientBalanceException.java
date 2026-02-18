package com.bootcamp.week2.Ejercicios.bank;

public class InsufficientBalanceException  extends Exception{
    private final double deficit;

    public InsufficientBalanceException (double deficit) {
        super("Insufficient balance. Deficit: " + deficit);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
