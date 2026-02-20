package com.bootcamp.week2.Ejercicios.bank_1;

public class BankAccount {
    private double balance;
    private boolean locked;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        this.locked = false;
    }

    public void deposit(double amount){
        //TODO: si amount <= 0lanzar InvalidAmountException
        if(amount <= 0) throw new InvalidAmountException("Monto invalido: " + amount);
        //TODO:sumar al balance
        balance+= amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) throw new InvalidAmountException("Monto invalido: " + amount);
        //TODO: si amount > balance lanzar InsufficientBalanceException con deficit
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientBalanceException(String.format("Fondo insuficientes para retirar $%.2f", amount), deficit);
        }
        balance -= amount;
    }
        //TODO: restar del balance

    public void transfer(BankAccount target, double amount)
        throws InsufficientBalanceException {
        //TODO: usar try-with-resources con TransactionLog
        //      dentro: withdraw, target.deposit, lg ambas operaciones
        try (TransactionLog log = new TransactionLog()){
            this.withdraw(amount);
            log.log(String.format("Retiro de $%.2f de cuenta origen. Saldo: $%.2f", amount, this.balance));

            target.deposit(amount);
            log.log(String.format("Deposito de $%.2f en cuenta destino. Saldo: $%.2f", amount, target.balance));
        }
    }

    public void lock() { this.locked = true; }
    public double getBalance() { return balance; }

}


