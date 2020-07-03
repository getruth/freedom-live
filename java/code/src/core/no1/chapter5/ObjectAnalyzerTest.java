package core.no1.chapter5;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String ...args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i< 5; i++) {
            arr.add(i);
        }
        System.out.println(new ObjectAnalyzer().toString(arr));
    }
}
