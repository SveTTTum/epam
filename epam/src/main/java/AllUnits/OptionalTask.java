package AllUnits;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое количество чисел введем: ");
        int len = sc.nextInt();
        String[] arr = new String[len];
        System.out.println("Введите числа: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }
//выводим массив в консоль:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
    //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
    public static void LenOfNum(String[] arr) {
        int min = arr[0].length();
        int max = 0;
        //ищем максимальную и минимальную длину элементов
        for (String val : arr) {
            if (val.length() > max) {  max = val.length(); }
            else if (val.length() < min) {  min = val.length(); }
        }
        //выводим результаты в консоль
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max)
                System.out.println("Max number is " + arr[i] + " his length " + arr[i].length());
            else if (arr[i].length() == min)
                System.out.println("Min number is " + arr[i] + " his length " + arr[i].length());
        }
    }
    //Вывести числа в порядке возрастания (убывания) значений их длины. По возрастанию:
    public static void WhoOlder(String[] arr) {
        String temp;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i].length() > arr[i+1].length()) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //Вывести числа в порядке возрастания (убывания) значений их длины. По убыванию:
    public static void WhoYanger(String[] arr) {
        boolean needIteration = true;
        String temp;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i].length() < arr[i+1].length()) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину
    public static void MidBigLit(String[] arr) {
        int mid = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].length();
        }
        mid = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > mid)
                System.out.println("Длина числа больше средней длины " + arr[i] + " his length " + arr[i].length());
            else if (arr[i].length() < mid)
                System.out.println("Длина числа меньше средней длины " + arr[i] + " his length " + arr[i].length());
        }
    }
    //Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них
    public static void diffNumbers(int[] arr) {
        int min = diffNum(arr[0]);
        int minElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (diffNum(arr[i]) < min) {
                min = diffNum(arr[i]);
                minElem = arr[i];
            }
        }
        System.out.printf("Elem: %d", minElem);
    }
    //счетчик уникальных цифр в числе
    public static int diffNum(int x) {
        HashSet<Integer> nums = new HashSet<>();
        while (x > 0) {
            nums.add(x % 10);
            x /= 10;
        }
        return nums.size();
    }
}
