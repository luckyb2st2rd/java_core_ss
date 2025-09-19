package basics;

public class Variables {
    public static void main(String[] args) {
        // 1. Обявление и инициализация переменных
        byte b = 126;
        short s = 180;
        int i = 22124535;
        long l = 921243232;
        float f = 3.14f;
        double d = 3.1423761;
        boolean bool = true;
        char simbol = 'A';

        // 2. Вывод значений с описанием
        System.out.println("Рост ребенка составляет: " + b);
        System.out.println("Средний рост человека составляет: " + s);
        System.out.println("Население города Z составляет: " + i);
        System.out.println("Население города в Китае составляет: " + l);
        System.out.println("Приближенное значение числа пи составляет " + f);
        System.out.println("Точное значение числа пи составляет " + d);
        System.out.println("Ты лох, и это " + bool);
        System.out.println("Первая буква моего имени, это " + simbol);

        // 3. Явное приведение long в int
        int i1 = (int) l;

        System.out.println(i1);

        long faild;
        faild = l - i1;
        System.out.println("Потеря данных при конвертации составила: " + faild);

        // 4. Конвертация char в int и обратно
        int i2 = simbol + 1;
        int i3 = simbol + 2;
        int i4 = simbol + 3;

        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        char sim1 = (char) i2;
        char sim2 = (char) i3;
        char sim3 = (char) i4;

        System.out.println(sim1);
        System.out.println(sim2);
        System.out.println(sim3);
    }
}
