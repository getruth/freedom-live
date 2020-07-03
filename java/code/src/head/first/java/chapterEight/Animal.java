package head.first.java.chapterEight;

abstract public class Animal {
    String name;
    abstract public void eat();
    Animal(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void live() {
        System.out.println("Animal live");
    }
}
