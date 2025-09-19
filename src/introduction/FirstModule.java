package introduction;

import java.util.Scanner;

public class FirstModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Привет, " + name  + "!");
        System.out.println("Тебе уже " + age + " года!");
    }
}
