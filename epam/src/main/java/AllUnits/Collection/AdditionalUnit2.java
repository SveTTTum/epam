package AllUnits.Collection;
import java.nio.charset.Charset;
import java.util.*;
import java.util.Stack;
//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
public class AdditionalUnit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = scanner.nextLine();
        char[] charArray = number.toCharArray();

        Stack <Integer> stack = new Stack();
        for (int i=0; i<charArray.length; i++) {
            int numOfNumber = Character.getNumericValue(charArray[i]);
            stack.push(numOfNumber);
        }
        System.out.println("Стек: " + stack);
        String reverseNumber = "";
        while (!stack.isEmpty()) {
            reverseNumber += stack.pop();
        }
        System.out.println("Перевернутое число " + reverseNumber);
    }
}
