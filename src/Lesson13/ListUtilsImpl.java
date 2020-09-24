package Lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListUtilsImpl implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> list = new ArrayList<>();
        for (String s: strings) {
            list.add(s);
        }
        return list;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> reverse = new ArrayList<>();
        reverse.addAll(data);
        Collections.sort(reverse);
        Collections.reverse(reverse);
        return reverse;
    }
}
