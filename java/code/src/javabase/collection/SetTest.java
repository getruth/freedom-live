package javabase.collection;

import comm.DumpInfo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void dump(HashSet<? extends Number> set) {
        for (var v : set) {
            System.out.print( v + ", ");
        }
        System.out.println();
    }
    public static void dump(TreeSet<? extends String> set) {
        for (var v : set) {
            System.out.print( v + ", ");
        }
        System.out.println();
    }

    public static void HashSetTest() {
        DumpInfo.splitLine("HashSetTest");
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
        }
        hashSet.add(1);
        Integer integer = Integer.MAX_VALUE;
        hashSet.add(integer);
        dump(hashSet);
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hashSet.add(i);
        }
        DumpInfo.splitLine("HashSetTest::retainAll");
        hashSet.retainAll(hashSet1);
        System.out.println(hashSet);
        dump(hashSet);
    }
    public static void TreeSetTest() {
        DumpInfo.splitLine("TreeSetTest");
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add( i + "s");
        }
        treeSet.add("");
        treeSet.add("");
        treeSet.add("");
        //TreeSet<String> treeSet1 = treeSet.subSet("0s", "5s");
        dump(treeSet);
    }

    public static void LinkedHashSetTest() {
        DumpInfo.splitLine("LinkedHashSetTest");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(i );
        }
        dump(linkedHashSet);
    }
    public static void main(String[] args) {
        HashSetTest();
        TreeSetTest();
        LinkedHashSetTest();
    }
}
