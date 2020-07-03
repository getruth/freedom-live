package head.first.java.chapterThree;

public class Dog {
    int age; // 默认public属性
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        name = "123";
    }
}

