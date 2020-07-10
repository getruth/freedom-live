package javabase.collection;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


import java.util.Hashtable;
import java.util.Map.Entry;

public class MapTest {
    public static void dump(Map<Integer, String> map) {
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    public static void HashtableTest() {
        //Hashtabe<String, Integer> ht = new HashMap<String, Integer>();
        Hashtable<Integer, String> hashtabe = new Hashtable<Integer, String>();
        for(int i =0; i < 10; i++) {
            hashtabe.put(i, i + "-Hashtable");
        }
        hashtabe.put(1, "yulan");
        dump(hashtabe);
    }
    public static void HashMapTest() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        for(int i =0; i < 10; i++) {
            hashMap.put(i, i + "-HashMap");
        }
        dump(hashMap);
    }
    public static void LinkedHashMapTest() {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        for(int i =0; i < 10; i++) {
            linkedHashMap.put(i, i + "-LinkedHashMap");
        }
        dump(linkedHashMap);
    }
    public static void TreeMapTest() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        for(int i =0; i < 10; i++) {
            treeMap.put(i, i + "-TreeMap");
        }
        dump(treeMap);
        System.out.println("Copy TreeMap");
        TreeMap<Integer, String> copyMap = new TreeMap(treeMap);
        dump(copyMap);
        System.out.println("TreeMap forEach");
        copyMap.forEach((k,v)->System.out.print("key = " + k + " value = " + v));
        System.out.println();
        treeMap.put(101, "putAll");
        copyMap.putAll(treeMap);
        dump(copyMap);
        try {
            System.out.println("copyMap.get invaild k-v :" + copyMap.get(111));
            System.out.println("copyMap.getOrDefault invaild k-v :" + copyMap.getOrDefault(111, "getOrDefault"));
            System.out.println(copyMap);
            Set<Integer> keys = copyMap.keySet();
            System.out.println("---------------Map.keySet---------------\n" + keys);
            System.out.println("---------------Map.entrySet()----------------");
            for (Map.Entry<Integer, String> entry : copyMap.entrySet()) {
                int i = entry.getKey();
                String string = entry.getValue();
                System.out.print("key = " + i + " val = " + string);
            }
            System.out.println();
            var v = copyMap.values();
            System.out.println("---------------Map.values() --------------- \n" + v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String GetValueByKey(String filePath, String key) {
        Properties pps = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));
            pps.load(in);
            String value = pps.getProperty(key);
            return value;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    //public
    public static void PropertiesTest() {
        Properties properties = new Properties();
        for(int i =0; i < 10; i++) {
            //properties.
        }
    }
    enum Weekday {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };
    public static void EnumSetTest() {
        EnumSet<Weekday> enumSet = EnumSet.allOf(Weekday.class);
        System.out.println("----------EnumSet.allOf----------\n" + enumSet);
        EnumSet<Weekday> enumSet1 = EnumSet.of(Weekday.FRIDAY, Weekday.SUNDAY);
        System.out.println("EnumSet.retainAll = " + enumSet.retainAll(enumSet1));
    }
    public static void EnumMapTest() {
        EnumMap<Weekday, String> enumMap = new EnumMap<Weekday, String>(Weekday.class);
        enumMap.put(Weekday.FRIDAY, "星期五");
        System.out.println("----------EnumMap.allOf----------");
        enumMap.forEach((k,v) -> System.out.print( " k = " + k + " v = " + v));
        System.out.println();

        EnumSet<Weekday> enumSet1 = EnumSet.of(Weekday.FRIDAY, Weekday.SUNDAY);
        System.out.println("EnumMap.get = " + enumMap.get(Weekday.FRIDAY));
    }
    public static void main(String[] args) {
        HashtableTest();
        HashMapTest();
        LinkedHashMapTest();
        TreeMapTest();
        PropertiesTest();
        EnumSetTest();
        EnumMapTest();
    }
}
