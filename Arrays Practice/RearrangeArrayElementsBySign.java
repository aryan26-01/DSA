
// Q. https://leetcode.com/problems/rearrange-array-elements-by-sign/

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] neg_arr = new int[n / 2];
        int[] pos_arr = new int[n / 2];
        int[] ans = new int[n];

        int neg = 0;
        int pos = 0;

        // Separate positives and negatives
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos_arr[pos++] = nums[i];
            } else {
                neg_arr[neg++] = nums[i];
            }
        }

        // reset counters
        pos = 0;
        neg = 0;

        // Alternate positives and negatives
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                ans[k] = pos_arr[pos++];
            } else {
                ans[k] = neg_arr[neg++];
            }
        }
        return ans;
    }
}
