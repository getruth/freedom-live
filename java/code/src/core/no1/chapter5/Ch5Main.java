package core.no1.chapter5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ch5Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(12);
        ArrayGrow.goodArrayGrow(arrayList);
        System.out.println(arrayList + " ");
        int[] arr = { 0, 1 };
        System.out.println(arr.toString());
        arr = (int[]) ArrayGrow.goodArrayGrow(arr);
        arr[2] = 2;
        arr[3] = 3;
        System.out.println(arr[2]);
    }
}
