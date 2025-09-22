
// Q. https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.*;

class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            nums[i] *= nums[i];
            i++;
        }

        Arrays.sort(nums);
        return nums;
    }
}