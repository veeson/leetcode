package array;

import java.util.Arrays;

/**
 * Created by Wilson on 2018/3/4.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] < 9){
                return new int[]{digits[0] + 1};
            }
            digits[0] += 1;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[0] == 10) {
                int[] temp = new int[digits.length + 1];
                temp[0] = 1;
                return temp;
            }
            if (i == digits.length - 1) {
                if (digits[i] < 9) {
                    digits[i] += 1;
                    return digits;
                } else {
                    digits[i] = 0;
                    if (i > 0) {
                        digits[i - 1] += 1;
                    }
                }
            } else {
                if (digits[i] < 10) {
                    return digits;
                }
                digits[i] = 0;
                if (i > 0) {
                    digits[i - 1] += 1;
                }
            }

        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
