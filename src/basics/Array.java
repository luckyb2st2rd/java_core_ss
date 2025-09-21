package basics;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1 и 2. Создаем массив с помощью ввода с клавы и выводим все его элементы на экран
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Все элементы массива: " + Arrays.toString(arr));
        //3. Нахождение минимального индекса или элемента
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        // 4. Сортировка по возврастанию (пузырьком)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num + " ");
        }
        //5. Создаем двумерный массив c помощью ввода с клавы и выводим на экран
        int[][] matrix = new int[2][5];
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner1.nextInt();
            }
        }
        System.out.println("Матрица 2×5:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
