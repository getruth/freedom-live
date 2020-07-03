package core.no1.chapter5;

import java.lang.reflect.Array;

public class ArrayGrow {
    public static Object goodArrayGrow(Object o) {
        Class c = o.getClass();
        if (!c.isArray()) {
            return null;
        }
        Class com = c.getComponentType();
        int len = Array.getLength(o);
        int newLen = len * 11 / 10 +  10;
        Object newA = Array.newInstance(com, newLen);
        System.arraycopy(o, 0, newA, 0, len);
        return newA;
    }
}
