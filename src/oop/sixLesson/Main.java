package oop.sixLesson;

public class Main {
    public static void main(String[] args) {
        Player artem = new Player("Artem", 132);
        Player jarik = new Player("Jarik", 123);

        System.out.println(artem);
        System.out.println(jarik);

        System.out.println("Общий счет: " + GameScore.getTotalScore());
    }
}
