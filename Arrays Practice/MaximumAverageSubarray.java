
// Q. https://leetcode.com/problems/maximum-average-subarray-i/

import java.util.*;

class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double curr_sum = 0;
        double max_sum = 0;
        int n = nums.length;
        double avg = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            curr_sum += nums[i];
        }
        max_sum = curr_sum;
        avg = max_sum / k;

        for (int st = 1, en = k; en < n; st++, en++) {
            curr_sum -= nums[st - 1];
            curr_sum += nums[en];
            max_sum = Math.max(max_sum, curr_sum);
            avg = max_sum / k;
        }
        return avg;
    }
}