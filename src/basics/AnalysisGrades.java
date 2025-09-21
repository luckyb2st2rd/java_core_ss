package basics;
import java.util.Scanner;

public class AnalysisGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        // 1. Средний балл
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Средний балл студента равен: " + average);
        // 2. Все ли 10?
        if (num1 == 10 && num2 == 10 && num3 == 10) {
            System.out.println("У студента все оценки максимальные!");
        }
        // 3. Хоть одна <= 2
        if (num1 <= 2 || num2 <= 2 || num3 <= 2) {
            System.out.println("Встречается очень низкая оценка!");
        }
        // 4. Успеваемость
        if (average >= 5) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println("У студента неудовлетворительная успеваемость");
        }
        // 5. Диапазон
        if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10) {
            System.out.println("Ошибка: некорректная оценка!");
        }
    }
}
