package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wilson on 2018/3/4.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,11,15,7,56,3,12};
        System.out.println(Arrays.toString(twoSum(nums, 15)));
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
