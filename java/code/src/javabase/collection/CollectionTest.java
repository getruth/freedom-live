package javabase.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {
    /*
    public static void Print(T t) {
        for (T str : t) {
            System.out.println(str);
        }
    }
    */
    public static void StringOp() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add( "hello World!");
        linkedList.add("i love you!");
        Iterator<String> iterator = linkedList.iterator();
        iterator.next();
        iterator.remove();

    }

    public static void main(String[] args) {
        CollectionTest.StringOp();
    }
}
