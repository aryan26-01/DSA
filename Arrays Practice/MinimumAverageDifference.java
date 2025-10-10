
// Q. https://leetcode.com/problems/minimum-average-difference/

public class MinimumAverageDifference {
    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long min_diff = Integer.MAX_VALUE;
        long first_sum = 0;
        long curr_diff = Integer.MAX_VALUE;
        int index = 0;
        long last = 0;

        long pref[] = new long[n];
        pref[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i] + pref[i - 1];
        }

        for (int j = 0; j < n; j++) {
            first_sum = pref[j];
            long first = j + 1;
            last = pref[n - 1] - first_sum;
            long m = n - j - 1;
            if (m > 0) {
                curr_diff = Math.abs(first_sum / first - (last) / (n - j - 1));
            } else {
                curr_diff = Math.abs(first_sum / first - 0);
            }

            if (curr_diff < min_diff) {
                min_diff = curr_diff;
                index = j;
            }
        }
        return index;
    }
}
