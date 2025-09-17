
//Q: https://leetcode.com/problems/max-consecutive-ones/description/

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0) {
                if (count > max_count) {
                    max_count = count;
                }
                count = 0;
            }

        }
        if (count > max_count) {
            return count;
        } else {
            return max_count;
        }
    }
}