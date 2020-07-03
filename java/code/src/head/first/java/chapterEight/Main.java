package head.first.java.chapterEight;

public class Main {
    static Object getObject(Object o) {
        return o;
    }
    public static void main(String []args) {
        Animal a = new Dog("YY");
        //a.eat();
        Dog d = new Dog("XX");
        System.out.println(d.equals(a));
        System.out.println(d.hashCode());
        System.out.println(d.toString());
        System.out.println(a.getClass());
        d.eat();
        a.eat();
        d.live();
        a.live();
        Object o = getObject(d);
        System.out.println(o.getClass());
        if (getObject(d) instanceof Dog) {
            Dog e = (Dog) getObject(d);
            System.out.println(e.getClass());
            e.live();
            e.eat();
            e.beFriendly();
            e.play();
        }
        PetDog pd = new PetDog();
        pd.beFriendly();
        // autoboxing
        TestBox tb = new TestBox();
        tb.go();
        // 格式化打印
        tb.fomart();
        // 日期显示
        MyDate md = new MyDate();
        md.MyDateSh();

        MyCalendar mc = new MyCalendar();
        mc.MyCalendarsh();
    }
}
