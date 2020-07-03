package head.first.java.chapterEight;

import java.util.Date;

public class MyDate {
    public void MyDateSh() {
        Date today = new Date();

        String date = String.format("%tc ", today);
        System.out.println(date);
        date = String.format("%tr", today);
        System.out.println(date);
        date = String.format("%tA", today);
        System.out.println(date);
        date = String.format("%tB", today);
        System.out.println(date);
        date = String.format("%td", today);
        System.out.println(date);
        date = String.format("%tA, %<tB, %<td", today);
        System.out.println(date);
    }
}
