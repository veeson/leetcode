package array;

/**
 * Created by Wilson on 2018/3/4.
 */
public class MaximumSubarray {

    public static int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }


    public static int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int result=nums[0];
        int re=nums[0];
        for (int i = 1; i < nums.length; i++) {
            result=Math.max(result+nums[i], nums[i]);
            if(result>re){
                re=result;
            }
        }
        return re;

    }

    public static void main(String[] args) {
        int[] nums = {-2, -8, -3, -4, -8, -2, -8, -5, -4};
        System.out.println(maxSubArray1(nums));
        System.out.println(maxSubArray2(nums));
    }
}
