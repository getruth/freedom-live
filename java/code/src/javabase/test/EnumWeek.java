package javabase.test;

public enum EnumWeek {
    Monday("周一"),
    Tuesday("周二"),
    Wednesday("周三"),
    Thursday("周四"),
    Friday("周五");
    private String des;
    private EnumWeek(String des) {
        this.des = des;
    }
    public String getDes() {
        return this.des;
    }
    public static void main(String[] args) {
        for (EnumWeek w : EnumWeek.values()) {
            System.out.println( w + ": " + w.getDes());
        }
        Enum e = EnumWeek.Friday;
        for(Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}
