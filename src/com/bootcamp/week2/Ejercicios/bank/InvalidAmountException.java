package com.bootcamp.week2.Ejercicios.bank;

public class InvalidAmountException  extends RuntimeException{

    public InvalidAmountException (String message) {
        super(message);
    }
}
