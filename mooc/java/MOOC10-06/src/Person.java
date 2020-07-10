import java.util.Arrays;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person another) {
		int i = 0;
		i = name.compareTo(another.name); // 使用字符串的比较
		if (i == 0) {
			// 如果名字一样,比较年龄, 返回比较年龄结果
			return age - another.age;
		} else {
			return i; // 名字不一样, 返回比较名字的结果.
		}
	}

	public static void main(String... a) {
		Person[] ps = new Person[3];
		ps[0] = new Person("Tom", 20);
		ps[1] = new Person("Mike", 18);
		ps[2] = new Person("Mike", 20);

		Arrays.sort(ps);
		for (Person p : ps) {
			System.out.println(p.getName() + "," + p.getAge());
		}
	}
}