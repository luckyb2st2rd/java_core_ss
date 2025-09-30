package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (!exit) {

            printMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка, введите число из меню.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {

            }
        }

    }

    private static void printMenu() {
        System.out.println("""
                    === Библиотечный Каталог ===
                    Выберите действие:
                    1. Добавить новую публикацию
                    2. Вывести список всех публикаций
                    3. Поиск публикаций по автору
                    4. Вывести общее количество публикаций
                    0. Выход
                    """);
    }
}
