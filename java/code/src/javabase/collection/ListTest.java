package javabase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ListTest {
    public static  void splitLine() {
        System.out.println("-----------------------------------------------------");
    }
    public static void splitLine(String s) {
        System.out.format("\n---------------------%s------------------------\n", s);
    }
    public static void dump(List t) {
        for (var v : t) {
            System.out.print(v + " ,");
        }
    }
    public static void ListedListTest1() {
        splitLine("ListedListTest1");
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.addFirst(-1);
        list.addLast(-2);
        System.out.println(" LinkedList size = " + list.size());
        System.out.println(" LinkedList get " + list.get(9));
        dump(list);
        // list.
    }
    // 同步
    public static void ArrayListTest1() {
        splitLine("Collections.synchronizedList");
        List list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(" list size = " + list.size());
        System.out.println(" list get " + list.get(9));
        dump(list);
        //list.
    }
    // 不同步
    public static void ArrayListTest2() {
        splitLine("ArrayList");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(" list size = " + arrayList.size());
        System.out.println(" list get " + arrayList.get(2));
        dump(arrayList);
        arrayList.trimToSize();
        System.out.println(" list size = " + arrayList.size());
    }
    public static void VectorList1() {
        splitLine("vector");
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println(" list size = " + vector.size());
        System.out.println(" list get " + vector.get(2));
        vector.trimToSize();
        System.out.println(" list size = " + vector.size());
        dump(vector);
    }
    public static void main(String[] args) {
        ListedListTest1();

        ArrayListTest1();
        ArrayListTest2();
        VectorList1();
    }
}
