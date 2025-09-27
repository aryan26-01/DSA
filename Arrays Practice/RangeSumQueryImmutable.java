
// Q. https://leetcode.com/problems/range-sum-query-immutable/
// Solved using prefix approach

public class RangeSumQueryImmutable {
    int prefix[];

    public RangeSumQueryImmutable(int[] nums) {
        int n = nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }

        else {
            return prefix[right] - prefix[left - 1];
        }

    }
}
