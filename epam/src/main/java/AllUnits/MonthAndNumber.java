package AllUnits;

import java.util.Scanner;

public class MonthAndNumber {
    static void setMonth(int number) {
        //создаем массив месяцев:
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String month;
        try {
            month = months[number - 1];
            System.out.println("Это месяц - " + month + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int number = sc.nextInt();
        setMonth(number);
        sc.close();
    }
}
