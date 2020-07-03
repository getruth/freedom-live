package head.first.java.chapterFour;

public class Main {
    static void intCompareAandB() {
        int a = 3;
        Byte b = 3;
        System.out.println("int a == b ? " + (a == b) );
    }
    static void stringCompareAandB() {
        String a = "abcdefg";
        String b = "abcdefg";
        System.out.println("String a == b ? " + (a == b) );
    }
    public static void main(String []args) {
        intCompareAandB();
        stringCompareAandB();
    }
}
