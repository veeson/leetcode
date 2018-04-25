package recursive;

/**
 * Created by Wilson on 2018/3/13.
 */
public class LongestUnivaluePath {
    public static int solution(int[] nums) {
        int sum = 1;
        int sum2 = 0;
        int path = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (path == nums[i]) {
                sum++;
            } else {
                path = nums[i];
                sum2++;
                if (sum < sum2) {
                    sum = 0;
                }
            }

        }
        return sum;
    }
}
