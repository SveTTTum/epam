package AllUnits.Collection;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AdditionalUnits {

    //4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
    private static final Comparator<String> WordLengthComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void sortPoemHeightLineLengths() {
        List<String> list = new ArrayList();
        list.add("Я к вам пишу — чего же боле?\n");
        list.add("Что я могу ещё сказать?\n");
        list.add("Теперь, я знаю, в вашей воле\n");
        list.add("Меня презреньем наказать.\n");
        System.out.println(list);
        list.sort(WordLengthComparator);
        System.out.println(list);
    }

    //3.	Создать список из элементов каталога и его подкаталогов.
    public static void listDirectoryItemsAndSubdirectories() {
        File dir = new File("d:\\Work\\Тестирование\\Additional Unit");
        List<File> ret = new ArrayList<File>();
        if (dir.isDirectory()) {
            Collections.addAll(ret, Objects.requireNonNull(dir.listFiles()));
        }
        System.out.println("\n Files and folders:\n" + ret);
    }

    //2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
    public static void numberFromStackInReverce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = scanner.nextLine();
        char[] charArray = number.toCharArray();

        Stack<Integer> stack = new Stack();
        for (char c : charArray) {
            int numOfNumber = Character.getNumericValue(c);
            stack.push(numOfNumber);
        }
        System.out.println("Стек: " + stack);
        StringBuilder reverseNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            reverseNumber.append(stack.pop());
        }
        System.out.println("Перевернутое число " + reverseNumber);
    }

    //1.	Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
    public static void getLinesOfFileInReverce() throws Exception {
        FileWriter writer = new FileWriter("list4.txt");
        writer.write("one\n");
        writer.write("two\n");
        writer.write("three\n");
        writer.write("fore\n");
        writer.write("five\n");
        writer.close();
        FileReader fileReader = new FileReader("list4.txt");
        Scanner scanner = new Scanner(fileReader);
        List<String> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            numbers.add(scanner.nextLine());
        }
        scanner.close();
        Collections.reverse(numbers);
        FileWriter updateFile = new FileWriter("list4.txt");
        for (String line : numbers) {
            updateFile.write(line);
            updateFile.write(System.getProperty("line.separator"));
        }
        updateFile.close();
    }
}