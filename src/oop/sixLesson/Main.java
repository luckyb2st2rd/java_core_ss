package oop.sixLesson;

public class Main {
    public static void main(String[] args) {
        SavingAccount first = new SavingAccount(10);
        CreditAccount second = new CreditAccount(-100);
        first.deposit(11);
        first.withdraw(22);

        second.deposit(200);
        second.withdraw(700);

        Printable[] accounts = {first, second};
        for (Printable p : accounts) {
            p.printInfo();
        }
    }
}
