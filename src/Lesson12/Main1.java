package Lesson12;

import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("qqq");
        strings.add("www");
        strings.add("eee");
        strings.add("rrr");
        strings.add("ttt");

        System.out.println(strings);

        // 1 - стандартный цикл for
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        // 2 - цикл foreach
        for (String s :strings) {
            System.out.println(s);
        }
        // 3 - с помощью итератора
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
