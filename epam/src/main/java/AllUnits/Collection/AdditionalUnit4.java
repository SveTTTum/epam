package AllUnits.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
public class AdditionalUnit4 {
    private static final Comparator<String> WordLengthComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Я к вам пишу — чего же боле?\n");
        list.add("Что я могу ещё сказать?\n");
        list.add("Теперь, я знаю, в вашей воле\n");
        list.add("Меня презреньем наказать.\n");
        System.out.println(list);
        Collections.sort(list, WordLengthComparator);
        System.out.println(list);
    }

}
