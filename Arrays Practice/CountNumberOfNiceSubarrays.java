
// Q. https://leetcode.com/problems/count-number-of-nice-subarrays/
// Solved using variable sized sliding window algorithm.

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int ans = 0;

        // System.out.println(Arrays.toString(nums));

        for (int st = 0, en = 0; en < nums.length; en++) {
            if (nums[en] % 2 != 0) { // Odd number
                // System.out.println(nums[en] + " is Odd");
                count += 1;
                // System.out.println("Count becomes : " + count);

                while (count > k) {
                    if (nums[st] % 2 != 0) {
                        count--;
                    }
                    st++;
                }
            }

            // System.out.println("Current arr: " + arr);

            if (nums[en] % 2 == 0) { // Even number
                // System.out.println(nums[en] + " is even");
            }

            int temp = st;
            while (count == k && temp <= en) {
                // System.out.println("Count == k");
                ans += 1;
                // System.out.println("Ans becomes: " + ans);
                if (nums[temp] % 2 != 0) {
                    break;
                }
                temp++;
            }
        }

        return ans;
    }
}
