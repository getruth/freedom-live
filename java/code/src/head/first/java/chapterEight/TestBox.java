package head.first.java.chapterEight;

public class TestBox {
    Integer i = 0;
    int j;
    public void go() {
        j = i;
        System.out.println(i);
        System.out.println(j);
    }
    public void fomart() {
        String s = String.format(" %, d", 1000000);
        System.out.println(s);
    }
}
