package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println(""" 
                    === Библиотечный каталог ===
                    1. Добавить публикацию
                    2. Показать все публикации
                    3. Поиск по автору
                    4. Общее количество публикаций
                    0. Выход
                    Ваш выбор:""");

            while (!scanner.hasNextInt()) {
                System.out.print("Нужно ввести число. Попробуйте ещё раз: ");
                scanner.next();
            }
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (choice == 0) {
                System.out.println("До встречи!");
                break;
            }

            if (choice == 1) {
                System.out.println("Выберите тип публикации: 1 – Book, 2 – Magazine, 3 – Newspaper");
                System.out.print("Тип: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Нужно ввести число (1, 2 или 3): ");
                    scanner.next();
                }
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Введите название: ");
                String title = scanner.nextLine().trim();
                while (title.isEmpty()) {
                    System.out.print("Пустое значение не допускается. Введите название: ");
                    title = scanner.nextLine().trim();
                }

                System.out.print("Введите автора: ");
                String author = scanner.nextLine().trim();
                while (author.isEmpty()) {
                    System.out.print("Пустое значение не допускается. Введите автора: ");
                    author = scanner.nextLine().trim();
                }

                System.out.print("Введите год: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Нужно ввести число (год): ");
                    scanner.next();
                }
                int year = scanner.nextInt();
                scanner.nextLine();

                Publication pub = null;

                if (type == 1) {
                    System.out.print("Введите ISBN: ");
                    String isbn = scanner.nextLine().trim();
                    if (isbn.isEmpty()) {
                        System.out.println("ISBN пустой, книга не добавлена.");
                    } else {
                        pub = new Book(title, author, year, isbn);
                    }
                } else if (type == 2) {
                    System.out.print("Введите номер выпуска: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Нужно ввести число (номер выпуска): ");
                        scanner.next();
                    }
                    int issueNumber = scanner.nextInt();
                    scanner.nextLine();
                    pub = new Magazine(title, author, year, issueNumber);
                } else if (type == 3) {
                    System.out.print("Введите день публикации (например, Понедельник): ");
                    String day = scanner.nextLine().trim();
                    if (day.isEmpty()) {
                        System.out.println("День публикации пустой, газета не добавлена.");
                    } else {
                        pub = new Newspaper(title, author, year, day);
                    }
                } else {
                    System.out.println("Неизвестный тип публикации.");
                }

                if (pub != null) {
                    library.addPublication(pub);
                    System.out.println("Добавлено: " + pub);
                }
                System.out.println();
            } else if (choice == 2) {
                library.listPublications();
                System.out.println();
            } else if (choice == 3) {
                System.out.print("Введите автора для поиска: ");
                String a = scanner.nextLine().trim();

                if (a.isEmpty()) {
                    System.out.println("Автор не указан.");
                } else {
                    library.searchByAuthor(a);
                }
                System.out.println();
            } else if (choice == 4) {
                System.out.println("Всего публикаций: " + Publication.getPublicationCount());
                System.out.println();
            } else {
                System.out.println("Нет такого пункта меню, попробуйте ещё раз.\n");
            }
        }

    }
}
