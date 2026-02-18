package com.bootcamp.week2.Ejercicios.bank;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(500);
        BankAccount acc2 = new BankAccount(200);

        acc1.deposit(150);

        try {
            acc1.withdraw(100);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        acc1.transfer(acc2, 200);

        acc1.transfer(acc2, 1000);

        acc1.lock();
        acc1.transfer(acc2, 50);

    }
}
