package head.first.java.chapterFive;

import java.lang.reflect.Array;

// 第5章 编写程序
public class Main {
    static void stringToInt(String str) {
        int gus = Integer.parseInt(str, 16);
        gus += 10;
        System.out.println(str + " + 10 = " +  gus);
    }
    public static void main(String []args) {
        stringToInt("10");
    }
}
