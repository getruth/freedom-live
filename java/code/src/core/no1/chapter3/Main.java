package core.no1.chapter3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3,4 ,65,7, 8, 4, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int a : arr) {
            System.out.println(a);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name: ");
        String str;
        str = scanner.next();
        System.out.println(str);
        int[] arr1 = arr;
        for (int a : arr1) {
            System.out.println(a);
        }
        int[] arr2 = Arrays.copyOfRange(arr1, 3, 6);
        for (int a : arr2) {
            System.out.println(a);
        }
    }
}
