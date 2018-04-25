package array;

/**
 * Created by Wilson on 2018/3/4.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = 0; i < m + n; i++) {
            if (nums1[index] <= nums2[i]) {
                nums1[i] = nums1[index++];
            } else {
                nums1[i] = nums1[index];
                i--;
            }
        }
    }
}
