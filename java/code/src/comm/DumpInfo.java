package comm;

public class DumpInfo {
    public static  void splitLine() {
        System.out.println("-----------------------------------------------------");
    }
    public static void splitLine(String s) {
        System.out.format("\n---------------------%s------------------------\n", s);
    }
}
