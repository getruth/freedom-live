package javabase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            list.add(i);
        }
        Iterator iter =  list.iterator();
        while (iter.hasNext()) {
            //iter.remove();
            System.out.println(iter.next());
            iter.remove();
        }
        System.out.println("removed!");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
