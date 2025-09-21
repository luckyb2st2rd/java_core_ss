package basics;

public class Cycles {
    public static void main(String[] args) {
        // 1. Использование for
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        // 2. Использваоние while
        int count = 10;
        while (count >= 1) {
            System.out.println("count: " + count);
            count--;
        }
        // 3. Вложенный цикл
        for (int f = 1; f <= 9; f++) {
            for (int s = 1; s <= 9; s++) {
                int product = f * s;
                System.out.println(f + " * " + s + " = " + product);
            }
        }
        // 4. Остановка вложенного цикла
        for (int f = 1; f <= 9; f++) {
            for (int s = 1; s <= 9; s++) {
                int product = f * s;
                if (product > 30) {
                    break;
                }
                System.out.println(f + " * " + s + " = " + product);
            }
        }
    }
}