package oop.fiveLesson;

public class SavingAccount extends Account implements Printable {

    public SavingAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма списания должна быть больше 0");
        }

        balance -= amount;

        if (balance < 0) {
            balance += amount;
            System.out.println("Недостаточно средств на счете. Баланс составляет: " + balance);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Баланс сберегательного счета равен " + balance);
    }
}
