package javabase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ListTest {
    //
    public static void ArrayListTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(" list size = " + list.size());
    }

    public static void main(String[] args) {
        ArrayListTest();
    }
}
