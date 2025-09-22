package basics;
import java.util.Scanner;

public class ContactManagementSystem {
    @SuppressWarnings("checkstyle:MethodLength")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[100];
        String[] phoneNumbers = new String[100];

        System.out.println("Выберите действие:" +
            "\n1. Добавить контакт" +
            "\n2. Просмотреть контакт" +
            "\n3. Найти контакт" +
            "\n4. Удалить контакт" +
            "\n5. Выйти");

        int choice = scanner.nextInt();

        if (choice < 1 || choice > 5) {
            System.out.println("Ошибка");
        } else {
            while (choice != 5) {
                switch (choice) {
                    case 1:
                        System.out.println("Введите номер телефона контакта");
                        String phone = scanner.nextLine();
                        System.out.println("Введите имя контакта");
                        String name = scanner.nextLine();
                        System.out.println("Контакт добавлен: " + name + " (" + phone + ")");
                        break;
                    case 2:
                        System.out.println("Выберите контакт для просмотра");
                        break;
                    case 3:
                        System.out.println("Введите имя контакта");
                        break;
                    case 4:
                        System.out.println("Введите имя контакта для удаления");
                        break;
                    case 5:
                        System.out.println("Вы уверены, что хотите выйти?" +
                                "\n1 - Да" +
                                "\n2 - Нет");
                        int choice1 = scanner.nextInt();
                        if (choice1 == 1) {
                            System.out.println("Да, выйти");
                        } else if (choice1 == 2) {
                            System.out.println("Нет, остаться");
                        } else {
                            System.out.println("Ошибка выберите 1 или 2");
                        }
                }
            }
        }
    }
}
