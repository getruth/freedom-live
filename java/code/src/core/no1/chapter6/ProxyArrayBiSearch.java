package core.no1.chapter6;

import java.lang.reflect.*;
import java.util.*;

public class ProxyArrayBiSearch {
    class TraceHandler implements InvocationHandler {
        private Object target;
        public TraceHandler(Object t) {
            target = t;
        }
        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            System.out.print(target);
            System.out.print("." + method.getName() + "(");
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    System.out.print(objects[i]);
                    if (i < objects.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println(")");
            return method.invoke(target, objects);
        }
    }
    public void start(String[] agrs) {
        try {
            Object[] elements = new Object[1000];
            for (int i = 0; i < elements.length; i++) {
                Integer value = i + 1;
                InvocationHandler handler = new TraceHandler(value);
                elements[i] = Proxy.newProxyInstance(null, new Class[] {Comparable.class }, handler);
            }
            Integer key = new Random().nextInt(elements.length) + 1;
            int result = Arrays.binarySearch(elements, key);
            if (result >= 0) {
                System.out.println(elements[result]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ProxyArrayBiSearch proxyArrayBiSearch = new ProxyArrayBiSearch();
        proxyArrayBiSearch.start(args);
    }
}
