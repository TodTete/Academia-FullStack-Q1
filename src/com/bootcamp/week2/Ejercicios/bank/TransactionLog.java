package com.bootcamp.week2.Ejercicios.bank;

public class TransactionLog  implements AutoCloseable{

    public TransactionLog(){
        System.out.println("Transaction log opened.");
    }

    public void log(String message){
        System.out.println("Transaction [LOG]: " + message);
    }

    @Override
    public void close() {
        System.out.println("Transaction log closed.");
    }
}
