package AllUnits;
import javax.swing.*;

public class SumAndMiltiplicationOfNumbers {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(JOptionPane.showInputDialog ("Введите число:"));
        Integer num2 = Integer.valueOf(JOptionPane.showInputDialog("Введите еще одно число:"));
        Integer num3 = Integer.valueOf(JOptionPane.showInputDialog("Ну и еще одно число:"));
        int sum = num1 + num2 + num3;
        int multiplication = num1 * num2 * num3;
        System.out.println(sum);
        System.out.println(multiplication);
    }
}
