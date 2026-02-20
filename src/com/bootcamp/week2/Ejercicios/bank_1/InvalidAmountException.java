package com.bootcamp.week2.Ejercicios.bank_1;

public class InvalidAmountException  extends RuntimeException{

    public InvalidAmountException (String message) {
        super(message);
    }
}
