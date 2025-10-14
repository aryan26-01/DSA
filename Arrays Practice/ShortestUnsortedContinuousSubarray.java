
// Q. https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int start = -1, end = -2; // initialize so that if already sorted -> end-start+1 = 0
        int max = nums[0], min = nums[n - 1];

        // from left to right: find the right boundary
        for (int i = 1; i < n; i++) {
            if (nums[i] < max) {
                end = i;
            } else {
                max = nums[i];
            }
        }

        // from right to left: find the left boundary
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > min) {
                start = i;
            } else {
                min = nums[i];
            }
        }
        // System.out.println("End " + end);
        // System.out.println("Start: " + start);
        return end - start + 1;
    }
}
