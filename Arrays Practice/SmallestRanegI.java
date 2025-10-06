
// Q. https://leetcode.com/problems/smallest-range-i/

public class SmallestRanegI {
    public int smallestRangeI(int[] nums, int k) {
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max_num = Math.max(max_num, nums[i]);
            min_num = Math.min(min_num, nums[i]);
        }

        int new_max = max_num - k;
        int new_min = min_num + k;

        if (new_min >= new_max) {
            return 0;
        } else {
            return new_max - new_min;
        }

    }
}
