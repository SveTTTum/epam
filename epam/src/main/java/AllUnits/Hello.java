package AllUnits;

import javax.swing.*;

public class Hello {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Введите ваше имя:");
        JOptionPane.showMessageDialog(null, "Добрый день, " + name + "!");
    }
}
