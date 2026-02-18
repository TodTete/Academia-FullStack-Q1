package com.bootcamp.week2.Ejercicios.bank;

public class AccountLockedException extends RuntimeException{
    public AccountLockedException(){
        super("Account is locked due to multiple failed login attempts.");
    }
}