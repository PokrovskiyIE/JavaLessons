package Lesson13;

import java.util.*;

public class SetUtilsImpl implements SetUtils{

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> result = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        result.addAll(set2);
        for (Integer n: collection1) {
            result.add(n.toString());
        }
        return result;
        // можно было не оверрайдить метод compare, а использовать метод: result.descendingSet()
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);
        return result;
    }
}
