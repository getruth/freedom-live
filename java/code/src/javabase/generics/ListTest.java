package javabase.generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListTest <T> {
    public T t;
    public T init(T s) {
        t = s;
        return t;
    }
    public static void run() {
        List<String> list = new LinkedList<String>();
        list.add("hello World");
        list.add("luowenjie");
        for (String s: list) {
            System.out.println(s);
        }
        List l = new LinkedList();
        l.add("hello");
        l.add("1234");
        // 编译器报错
        /*for (String s : l) {
            System.out.println(s);
        }*/
    }

    public <E> E genericMethod(Class<E> tClass)throws InstantiationException ,
            IllegalAccessException{
        E instance = tClass.newInstance();
        return instance;
    }

    public static <T> void getClassName(T t) {
        System.out.println(t.getClass());
    }
    public static void getClassNameRange(ListTest < ? extends Number > obj) {
        System.out.println(obj.getClass());
    }
    public static void main(String[] args) {
        ListTest.run();
        ListTest<String> listStr = new ListTest<String>();
        String hello = listStr.init("hello");
        System.out.println(hello);
        ListTest<Integer> listInt= new ListTest<Integer>();
        Integer integer = listInt.init(120);
        System.out.println(integer);
        if (listInt.equals(listStr)) {
            System.out.println("listStr equals listInt");
        } else {
            System.out.println("listStr not equals listInt");
        }

        Class classStr = listStr.getClass();
        Class classInt = listInt.getClass();
        if (classInt.equals(classStr)) {
            System.out.println("class listStr equals class listInt");
        } else {
            System.out.println("class listStr not equals class listInt");
        }
        try {
            Object obj = listInt.genericMethod(Class.forName("javabase.generics.ListTest"));
            System.out.println((ListTest) obj);
            ListTest.getClassName("hello");
            ListTest.getClassName(123);
            ListTest.getClassNameRange(listInt);
            // 这一行报错，因为类型必须为继承于Number的类型
            //ListTest.getClassNameRange(listStr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
