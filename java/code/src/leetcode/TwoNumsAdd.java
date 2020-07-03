package leetcode;
import java.util.*;

public class TwoNumsAdd {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index])) {
                return new int[]{ map.get(nums[index]), index};
            }
            map.put(target - nums[index], index);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoNumsAdd().twoSum(nums, target)));
    }
}
