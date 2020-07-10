import java.util.Arrays;
import java.util.Comparator;

public class Person2Comparator  implements Comparator<Person2> {
	public int compare(Person2 one, Person2 another) {
		int i = 0;
		i = one.getName().compareTo(another.getName());
		if (i == 0) {
			// 如果名字一样,比较年龄,返回比较年龄结果
			return one.getAge() - another.getAge();
		} else {
			return i; // 名字不一样, 返回比较名字的结果.
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2[] ps = new Person2[3];
		ps[0] = new Person2("Tom", 20);
		ps[1] = new Person2("Mike", 18);
		ps[2] = new Person2("Mike", 20);

		Arrays.sort(ps, new Person2Comparator());
		for (Person2 p : ps) {
			System.out.println(p.getName() + "," + p.getAge());
		}
	}
}
