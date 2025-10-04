
//Q. https://leetcode.com/problems/binary-subarrays-with-sum/

public class BinarySubarrayaWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int curr_sum = 0;
        int ans = 0;
        for (int st = 0, en = 0; en < nums.length; en++) {
            curr_sum += nums[en];
            while (curr_sum > goal) {
                curr_sum -= nums[st];
                st++;
            }

            int temp = st;
            while (curr_sum == goal && temp <= en) {
                ans += 1;
                if (nums[temp] == 1) {
                    break;
                }
                temp++;
            }
        }
        return ans;
    }
}
