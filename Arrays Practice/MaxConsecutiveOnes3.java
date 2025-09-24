
// Q. https://leetcode.com/problems/max-consecutive-ones-iii/

public class MaxConsecutiveOnes3 {
    public int longestOnes(int[] nums, int k) {
        int zero_count = 0;
        int ans = 0;

        for (int l = 0, r = 0; r < nums.length; r++) {

            if (nums[r] == 0) {
                zero_count++;
            }

            while (zero_count > k) {
                if (nums[l] == 0) {
                    zero_count--;
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);

        }
        return ans;
    }
}
