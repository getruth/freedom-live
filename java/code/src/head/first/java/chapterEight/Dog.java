package head.first.java.chapterEight;

public class Dog extends Animal implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog eat!");
    }
    public void live() {
        System.out.println("Dog live!");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is www!");
    }

    @Override
    public void play() {
        System.out.println("Dog run!");
    }
    Dog(String name) {
        super(name);
    }
}
