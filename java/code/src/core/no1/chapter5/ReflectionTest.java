package core.no1.chapter5;

import core.no1.chapter6.TimerTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String ...args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name : ");
            name = in.next();
        }
        try {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class" + name);
            if (superc1 != null && superc1 != Object.class) {
                System.out.print("extends " + superc1.getName());
            }
            System.out.print("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printfFields(c1);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class c1)
    {
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor c : constructors) {
            String name = c.getName(); // 获取构造器的名字
            System.out.print("  ");  // 行首空2格
            String modifiers = Modifier.toString(c.getModifiers()); // 获取构造器的属性 public
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name +"(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j <paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName()); // 打印参数类型
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class c1)
    {
        Method[] methods =c1.getDeclaredMethods();
        for (Method m :methods) {
            Class retType = m.getReturnType();
            //Class cc = m.getAnnotatedReturnType();
            String name = m.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers +" ");
            }
            System.out.print(retType.getName() + " "+ name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printfFields(Class c1)
    {
        Field[] fields = c1.getDeclaredFields();
        for (Field field :fields) {
            Class type = field.getType();
            String name = field.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() >0) {
                System.out.print(modifiers +" ");
            }
            System.out.println(type.getName() + " " +name + ";");
        }
    }
}
