package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i + "sf");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("ArrayList add " + (endTime1 - startTime1) + " ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i + "sf");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList add " + (endTime2 - startTime2) + " ms");

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("ArrayList get " + (endTime3 - startTime3) + " ms");

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("LinkedList add " + (endTime4 - startTime4) + " ms");
    }
}
