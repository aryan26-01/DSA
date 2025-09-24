
// Q. https://leetcode.com/problems/maximum-difference-between-increasing-elements/

public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int max_diff = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] > max_diff) {
                    max_diff = nums[j] - nums[i];
                }
            }
        }

        if (max_diff <= 0) {
            max_diff = -1;
        }

        return max_diff;
    }
}
