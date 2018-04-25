package array;

/**
 * Created by Wilson on 2018/3/4.
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        /*int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target > nums[i]) {
                j++;
            }
        }
        return j;*/

        int min = 0, left = 0, right = nums.length - 1;
        while (left <= right) {
            min = (right + left) / 2;
            if (target == nums[min]) {
                return min;
            }
            if (target > nums[min]) {
                left = min + 1;
            } else {
                right = min - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
