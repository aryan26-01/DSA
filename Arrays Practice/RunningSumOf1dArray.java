
// Q. https://leetcode.com/problems/running-sum-of-1d-array/

class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {

        int curr_sum = 0;

        int i = 0;
        while (i < nums.length) {
            curr_sum += nums[i];
            nums[i] = curr_sum;
            i++;
        }

        return nums;
    }
}
