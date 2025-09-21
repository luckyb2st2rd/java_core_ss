package basics;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        System.out.println("Выберите один из следующих жанров:\n"
                + "1 - комедия\n"
                + "2 - драма\n"
                + "3 - фантастика\n"
                + "4 - боевик\n"
                + "5 - аниме");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 5) {
            System.out.println("Такого жанра не знаю");
        } else {
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали комедию. Следующие фильмы доступны к просмотру:\n"
                            + "1 + 1\n"
                            + "Один дома");
                    break;
                case 2:
                    System.out.println("Вы выбрали драму. Следующие фильмы достпуны к просмотру:\n"
                            + "Анорма\n"
                            + "Зеленая миля");
                    break;
                case 3:
                    System.out.println("Вы выбрали фантастику. Следующие фильмы достпуны к просмотру:\n"
                            + "Аватар\n"
                            + "Интерстеллар");
                    break;
                case 4:
                    System.out.println("Вы выбрали боевик. Следующие фильмы доступны к просмотру:\n"
                            + "Гнев человеческий\n"
                            + "Переводчик");
                    break;
                case 5:
                    System.out.println("Вы выбрали аниме. Следующие сериалы доступны к просмотру:\n"
                            + "Ван Пис\n"
                            + "Наруто\n"
                            + "Блич");
                    break;
                default:
                    System.out.println("Такого жанра, к сожалению, нет");
            }
        }
    }
}