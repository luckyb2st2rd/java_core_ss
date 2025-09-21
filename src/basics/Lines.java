package basics;
import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(text.length());

        System.out.println(text.toUpperCase());

        if (text.contains("Java")) {
            System.out.println(text.indexOf("Java"));
        } else {
            System.out.println("Не найдено");
        }
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
