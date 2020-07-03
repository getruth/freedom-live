package javabase.test;

public class MemAnly {
    private int val = 0;

    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }

    public static void change(char [] chars) {
        for (int index = 0; index < chars.length; index++) {
            chars[index] += 1;
        }
    }
    public static void changeIt(char [] chars) {
        for (char c : chars) {
            c += 1;
        }
    }
    public static void PrintCharArr(char[] chars) {
        for (char c : chars) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MemAnly mem1 = new MemAnly();
        MemAnly mem2 = new MemAnly();
        System.out.println(mem1);
        System.out.println(mem2);
        // System.out.format("%p" , mem1);
        // System.out.format("%p" , mem2);
        int [] data = new int[] {1, 2, 3, 4, 5 };
        Integer[] temp = new Integer[] { 1, 2, 3, 4, 5};
        for (Integer i : temp) {
            i = i + 1;
            System.out.print(i + " ");
        }
        for (Integer i : temp) {
            System.out.print(i + " ");
        }

        String str1 = "lwj";
        String str3 = new String("lwj").intern();
        String str2 = new String("lwj");
        System.out.println("str1 == str2 ? " + str1 == str2);
        System.out.println("str2 == str3 ? " + str2 == str3);
        System.out.println("str1 == str3.intern() ? " + str1 == str3);
        System.out.println("str1.equals(str2) : " +  str1.equals(str2));
        System.out.println("str1.equals(str3) : " +  str1.equals(str3));
        System.out.println("str2.equals(str3) : " +  str2.equals(str3));
        char[] chars = { 'a', 'b', 'c', 'd', 'e'};
        MemAnly.change(chars);
        MemAnly.PrintCharArr(chars);
        MemAnly.changeIt(chars);
        MemAnly.PrintCharArr(chars);

        System.out.println("1234".hashCode());
        System.out.println("1234".hashCode());

    }
}
