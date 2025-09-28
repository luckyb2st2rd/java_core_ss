package oop.fiveLesson;

public class CreditAccount extends Account implements Printable {

    public CreditAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {

        balance -= amount;

        if (balance < -500) {
            balance += amount;
            System.out.println("Недостаточно средств на счете. Баланс составляет: " + balance);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Баланс кредитного счета равен " + balance);
    }
}
