package head.first.java.chapterEight;

public class PetDog extends Dog {
    @Override
    public void beFriendly() {
        super.beFriendly();
        System.out.println("Pet Dog beFriendly!");
    }
    PetDog(String name) {
        super(name);
    }
    PetDog (int age) {
        super("");
        System.out.println("PetDog is " + age);
    }
    PetDog() {
        super("");
        System.out.println("Default PetDog is " + 18);
    }
}
