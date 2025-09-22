package basics;
import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        int contactsBook = 0;

        boolean exit = false;

        while (!exit) {

            System.out.println("""
                    Выберите действие:
                    1 - Добавить контакт
                    2 - Просмотреть все контакты
                    3 - Найти контакт
                    4 - Удалить контакт
                    5 - Выйти""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > 5) {
                System.out.println("Ошибка, попробуйте другое действие");
                continue;
            }

            switch (choice) {

                case 1:
                    if (contactsBook == names.length) {
                        System.out.println("Нет места, удалите другой контакт");
                        break;
                    }
                    System.out.println("Введите имя пользователя");
                    String name = scanner.nextLine();
                    System.out.println("Вы успешно создали контакт " + name);
                    System.out.println("Введите номер для контакта " + name);
                    String phone = scanner.nextLine();
                    names[contactsBook] = name;
                    phoneNumbers[contactsBook] = phone;
                    contactsBook++;
                    System.out.println("Вы успешно добавили номер: " + phone + " к контакту " + name);
                    break;

                case 2:
                    if (contactsBook == 0) {
                        System.out.println("Контактов нет");
                        break;
                    }
                    System.out.println("Список всех контактов");
                    for (int i = 0; i < contactsBook; i++) {
                        System.out.println((i + 1) + ". " + names[i] + " - " + phoneNumbers[i]);
                    }
                    break;

                case 3:
                    System.out.println("Введите имя контакта");
                    String oldName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < contactsBook; i++) {
                        if (names[i].equalsIgnoreCase(oldName)) {
                            System.out.println(names[i] + " - " + phoneNumbers[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Контакт с именем " + oldName + " не найден.");
                    }

                case 4:
                    System.out.println("Введите имя контакта для удаления");
                    break;

                case 5:
                    exit = true;
                    System.out.println("Выйти");
                    break;

                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }
}
