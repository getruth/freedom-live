/* brief: 对象之间的赋值是引用，会改变赋值的两个对象的值 */

import java.util.*;

class Tank {
    int level;
}

class Value {
    int val;
    // equals() 的默认行为是比较对象的引用而非具体内容, 因此比较时要重载equals方法
    boolean equals(Value t) {
        return this.val == t.val;
    }
}
enum Size {
    SMALL("S"), MID("M"), LARGE("L"),EXL("XL");
    private Size(String s) {
        this.abbr = s;
    }
    public String getAbbr() {
        return abbr;
    }
    private String abbr;
}

public class EqualClass {

    static void alias(Tank a) { // 别名现象， 会改写入参的内容并返回
        a.level = 100;
    }
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 38;
        t2.level = 20;
        // ---------------------------------------------------------------
        System.out.println("t1 = " + t1.level + "; " + "t2 = " + t2.level);
        t1.level = 47;
        System.out.println("t1 = " + t1.level + "; " + "t2 = " + t2.level);
        t1 = t2; //这里是引用t2
        System.out.println("t1 = " + t1.level + "; " + "t2 = " + t2.level);
        t2.level = 10; // t1被改，t2也跟着变
        System.out.println("t1 = " + t1.level + "; " + "t2 = " + t2.level);
        alias(t1);
        System.out.println("t1 = " + t1.level + "; " + "t2 = " + t2.level);
        // ---------------------------------------------------------------
        // 对象之间的比较， equals 方法的重载
        Integer n1;
        Integer n2;
        n1 = 127;
        n2 = 127;
        System.out.println("n1.hash : " + t1.hashCode());
        System.out.println("n2.hash : " + t2.hashCode());
        //  IntegerCache [-128, 127]
        System.out.println("127 n1 == n2 ? " + (n1 == n2));
        System.out.println("n1.equals(n2) ? " + n1.equals(n2));
        n1 = 128;
        n2 = 128;
        System.out.println("n1.hash : " + t1.hashCode());
        System.out.println("n2.hash : " + t2.hashCode());
        System.out.println("128 n1 == n2 ? " + (n1 == n2));
        System.out.println("n1.equals(n2) ? " + n1.equals(n2));
        Value v1 = new Value();
        Value v2 = new Value();
        v1.val = v2.val = 10;
        System.out.println("v1.equals(v2) ? " + v1.equals(v2));

        short bls = (short)10;
        System.out.println("short b1: " + Integer.toBinaryString(bls));
        long l1 = 10;

        double d = 341_435_936.445_667;
        System.out.println("double d = 341_435_936.445_667 : " + d);


        Random rand = new Random(47);
        float[] f = new float[10];
        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for(float x : f) // for in
            System.out.println(x);
        if (t1.getClass() == t2.getClass()) {
            System.out.println(" t1 == t2" + t1.getClass().getName());
        }
        System.out.println("t1.hash : " + t1.hashCode());
        System.out.println("t2.hash : " + t2.hashCode());
        System.out.println(System.out);

        Size size = Size.EXL;
        System.out.println(size.EXL.toString());
        System.out.println(size.getAbbr());
        System.out.println(size.ordinal());
        System.out.println(t2.getClass().getName());
        System.out.println(t1.getClass() == Tank.class);
        try {
            Object o = t1.getClass().newInstance();
            EqualClass t3 = (EqualClass)o;
            System.out.println(t3.getClass().getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
