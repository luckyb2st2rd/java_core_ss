package oop.sixLesson;

public abstract class Account {
    protected double balance;

    protected Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public abstract void withdraw(double amount);
}
