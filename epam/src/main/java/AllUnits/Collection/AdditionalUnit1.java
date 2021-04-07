package AllUnits.Collection;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
//1.	Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
public class AdditionalUnit1 {
    public static void main(String[] args) throws Exception {
//        List<String> numbers = new ArrayList<String>();
//        numbers.add("one");
//        numbers.add("two");
//        numbers.add("three");
//        numbers.add("fore");
//        numbers.add("five");
//        numbers.add(2, null);
//        numbers.removeIf(e -> e==null);
        FileWriter writer = new FileWriter("list2.txt");
        writer.write("one\n");
        writer.write("two\n");
        writer.write("three\n");
        writer.write("fore\n");
        writer.write("five\n");
        writer.close();
        FileReader fileReader = new FileReader("list1.txt");
//     File file = new File("list1.txt");
        Scanner scanner = new Scanner(fileReader);
        List<String> numbers = new ArrayList<String>();
        while (scanner.hasNextLine()){
            numbers.add(scanner.nextLine());
        }
        scanner.close();
        Collections.reverse(numbers);
        FileWriter updateFile = new FileWriter("list3.txt");
        for (String line : numbers) {
            updateFile.write(line);
            updateFile.write(System.getProperty("line.separator"));
        }
        updateFile.close();
        //System.out.println(numbers);

    }

}
