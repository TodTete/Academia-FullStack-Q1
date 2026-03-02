package com.bootcamp.week4;

// el <T> es un tipo generico, se puede usar cualquier tipo de dato
class Transaction<T>{
    private T amount;

    public Transaction(T amount) {
        this.amount = amount;
    }

    public T getAmount() {
        return amount;
    }
}

public class main {
    public static void main(String[] args) {

    }
}
