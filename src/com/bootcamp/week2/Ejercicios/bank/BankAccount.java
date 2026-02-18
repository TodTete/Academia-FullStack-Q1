package com.bootcamp.week2.Ejercicios.bank;

public class BankAccount {

    private double balance;
    private boolean locked;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0)
            throw new InvalidAmountException(initialBalance);
        this.balance = initialBalance;
        this.locked = false;
    }

    public void lock() {
        locked = true;
    }

    public void deposit(double amount) {
        if (locked)
            throw new AccountLockedException();
        if (amount <= 0)
            throw new InvalidAmountException(amount);

        balance += amount;
        System.out.println("Deposited: $" + amount + " | Balance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (locked)
            throw new AccountLockedException();
        if (amount <= 0)
            throw new InvalidAmountException(amount);

        if (amount > balance) {
            throw new InsufficientBalanceException(amount - balance);
        }

        balance -= amount;
        System.out.println("Withdrawn: $" + amount + " | Balance: $" + balance);
    }

    public void transfer(BankAccount target, double amount) {
        try (TransactionLog log = new TransactionLog()) {

            log.log("Starting transfer of $" + amount);

            this.withdraw(amount);
            target.deposit(amount);

            log.log("Transfer completed successfully.");

        } catch (InsufficientBalanceException e) {
            System.err.println("Transfer failed: " + e.getMessage());
            System.err.println("Missing amount: $" + e.getDeficit());

        } catch (InvalidAmountException | AccountLockedException e) {
            System.err.println("Transfer error: " + e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }
}
