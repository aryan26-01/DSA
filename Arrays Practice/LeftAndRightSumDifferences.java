
// Q. https://leetcode.com/problems/left-and-right-sum-differences/

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int left[] = new int[n];
        // lef[0]=0;
        int right[] = new int[n];
        int ans[] = new int[n];
        // right[n-1]=0;
        int i = 0;
        int j = n - 1;
        int curr_sum = 0;
        while (i < n) {
            left[i] = curr_sum;
            curr_sum += nums[i];
            i++;
        }
        curr_sum = 0;

        while (j >= 0) {
            right[j] = curr_sum;
            curr_sum += nums[j];
            j--;
        }

        for (int k = 0; k < n; k++) {
            ans[k] = Math.abs(left[k] - right[k]);
        }

        return ans;
    }
}
