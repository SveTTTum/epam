package AllUnits;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print(rand.nextInt(10) + " ");
        System.out.print(rand.nextInt(10) + " ");
        System.out.println(rand.nextInt(10));

        System.out.println(rand.nextInt(20));
        System.out.println(rand.nextInt(20));
        System.out.println(rand.nextInt(20));


        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);
        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        System.out.println("2-ое случайное число: " + random_number2);
        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("3-е случайное число: " + random_number3);
    }
}
