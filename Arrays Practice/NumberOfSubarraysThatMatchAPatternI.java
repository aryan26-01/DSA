
// Q. https://leetcode.com/problems/number-of-subarrays-that-match-a-pattern-i/

class Solution {
    public int NumberOfSubarraysThatMatchAPatternI(int[] nums, int[] pattern) {
        int ans = 0;
        int k = pattern.length + 1;
        int n = nums.length;
        int final_ans = 0;

        for (int st = 0; st <= n - k; st++) {
            int m = 0;
            while (m < k - 1) {
                // System.out.println("M is " + m);
                // System.out.println("Nums[st+m+1] is " + nums[st+m+1]);
                // System.out.println("Nums[st+m] is " + nums[st+m]);
                if (pattern[m] == 1) {
                    if (nums[st + m + 1] > nums[st + m]) {
                        ans += 1;
                    }
                } else if (pattern[m] == 0) {
                    if (nums[st + m + 1] == nums[st + m]) {
                        ans += 1;
                    }
                } else {
                    if (nums[st + m + 1] < nums[st + m]) {
                        ans += 1;
                    }
                }
                m++;
                // System.out.println("St becomes: " + st);
                // System.out.println("Ans is " + ans);
            }
            if (ans == k - 1) {
                final_ans += 1;
            }
            ans = 0;
            // System.out.println("Final Ans is: " + final_ans);
        }
        return final_ans;
    }
}