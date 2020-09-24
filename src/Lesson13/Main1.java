package Lesson13;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(2);
        array.add(5);
        array.add(8);
        array.add(6);

        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(array);

    }
}
