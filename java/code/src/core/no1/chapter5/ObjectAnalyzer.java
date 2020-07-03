package core.no1.chapter5;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectAnalyzer {
    public String toString(Object obj)
    {
        Class c1 = obj.getClass();
        String r = c1.getName();

        do {
            r += "{";
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field f :fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) {
                        r +=",";
                    }
                    r +=f.getName() + "=";
                    try {
                        Object val = f.get(obj);
                        r += toString(val);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r +="]";
            c1 = c1.getSuperclass();
        } while (c1 != null);
        return r;
    }
}
