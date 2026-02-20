package com.bootcamp.week2.Ejercicios.bank;

public class BankAccount {
    private double balance;
    private boolean locked;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        this.locked = false;
    }

    public void deposit(double amount){
        //TODO: si amount <= 0lanzar InvalidAmountException
        if(amount <= 0) throw new InvalidAmountException();
        //TODO:sumar al balance
        balance++;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount <= 0) throw new InvalidAmountException("Monto invalido: " + amount);
        //TODO: si amount > balance lanzar InsufficientBalanceException con deficit
        if(amount > balance) throw new InsufficientBalanceException(deposit((amount - balance));
        //TODO: restar del balance

    }

    public void transfer(BankAccount target, double amount)
        throws InsufficientBalanceException {
        //TODO: usar try-with-resources con TransactionLog
        //      dentro: withdraw, target.deposit, lg ambas operaciones
        try{
            TransactionLog log = new TransactionLog();

        }
    }

    public void lock() { this.locked = true; }
    public double getBalance() { return balance; }


}


