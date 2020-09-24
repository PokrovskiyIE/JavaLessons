package Lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);

        CollectionUtilsImpl collectionUtilsImpl1 = new CollectionUtilsImpl();
        Collection<Integer> union = collectionUtilsImpl1.union(a, b);
        System.out.println(union);

        CollectionUtilsImpl collectionUtilsImpl3 = new CollectionUtilsImpl();
        Set<Integer> unionWithoutDuplicate = collectionUtilsImpl3.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate);

        ListUtilsImpl utils = new ListUtilsImpl();
        utils.asList("qwe", "asd", "zxc");

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(2.5);
        doubles.add(6.0);
        doubles.add(1.5);
        doubles.add(3.5);

        List<Double> result = utils.sortedList(doubles);

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(5);
        integers.add(1);
        integers.add(8);
        integers.add(2);

        HashSet<String> strings = new HashSet<>();
        strings.add("qwe");
        strings.add("asd");
        strings.add("zxc");

        SetUtilsImpl setUtilsImpl = new SetUtilsImpl();
        SortedSet<String> result1 = setUtilsImpl.orderedSet(integers, strings);
        System.out.println(result1);

    }
}
