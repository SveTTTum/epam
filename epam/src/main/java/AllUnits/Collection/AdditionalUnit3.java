package AllUnits.Collection;
import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//3.	Создать список из элементов каталога и его подкаталогов.
public class AdditionalUnit3 {
    public static void main(String[] args) {
        File dir = new File("d:\\Work\\Тестирование\\Additional Unit");
        File file1 = new File(dir, "list.txt");
        List<File> ret = new ArrayList<File>();
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    //System.out.println(item.getName() + "\t folder");
                    ret.add(item);
                } else {
                    // System.out.println(item.getName() + "\t file");
                    ret.add(item);
                }
            }
        }
        System.out.println(ret + "\n files and folders");
    }
}
