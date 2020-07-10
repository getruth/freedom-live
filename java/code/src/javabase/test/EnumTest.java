package javabase.test;

public class EnumTest {
    public static void main(String[] args) {
        EnumWeek week;
        week = EnumWeek.Wednesday;
        System.out.println(week);
        System.out.println(week.ordinal());
        System.out.println(week.name());
        System.out.println(week.getDeclaringClass());
    }
}
