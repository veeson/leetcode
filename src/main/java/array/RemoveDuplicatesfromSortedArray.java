package array;

import java.util.Arrays;

/**
 * Created by Wilson on 2018/3/4.
 */
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[++index] = nums[i+1];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(removeDuplicates(nums));
    }
}
