package AllUnits;
import javax.swing.*;

public class ReverseDialog {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Введите ваше имя:");
        JOptionPane.showMessageDialog(null, "Добрый день, "+name+"!");
        StringBuffer nameRev = new StringBuffer(name);
        System.out.print(nameRev.reverse());
    }
}
