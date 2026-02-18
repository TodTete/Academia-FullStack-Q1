package com.bootcamp.week2.Ejercicios.bank;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(double amount){
        super("Invalid amount: " + amount);
    }
}
