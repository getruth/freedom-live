package head.first.java.chapterThree;

public class Main {
    public static void main(String []args) {
        Dog []pit;
        pit = new Dog[7];
        pit[0] = new Dog();
        pit[0].setAge(12);
        String name = "";
        name = "dog0";
        pit[0].setName(name);
        pit[0].age = 16;
        System.out.println("pit[0].age = " + pit[0].getAge());
        System.out.println("pit[1].age = " + pit[1]);
        System.out.println("name = " + name);
    }
}
