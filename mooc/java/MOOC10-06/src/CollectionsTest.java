import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(2);
        list.add(19);
         
        // 排序
        Collections.sort(list);
        // 检索
        System.out.println("元素所在的索引值是：" + Collections.binarySearch(list, 12));
        //最大最小
        System.out.println("最大值：" + Collections.max(list));
        System.out.println("最小值：" + Collections.min(list));
        Collections.reverse(list); //翻转不需要用到排序
         
        Collections.fill(list, 100); //全部赋值为100
	}
}
