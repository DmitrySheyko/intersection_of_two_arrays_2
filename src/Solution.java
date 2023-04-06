import java.util.*;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) intersect(nums2, nums1);
        short[] maxLengthArray = new short[1001];
        int[] resultArray = new int[nums2.length];
        short count = 0;
        for (short i = 0; i < nums1.length; i++) {
            maxLengthArray[nums1[i]]++;
        }
        for (short j = 0; j < nums2.length; j++) {
            if (maxLengthArray[nums2[j]] > 0) {
                resultArray[count] = nums2[j];
                maxLengthArray[nums2[j]]--;
                count++;
            }
        }
        return Arrays.copyOfRange(resultArray, 0, count);
    }

}