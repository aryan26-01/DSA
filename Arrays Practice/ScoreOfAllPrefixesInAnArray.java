
// Q. https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/

public class ScoreOfAllPrefixesInAnArray {
    public long[] findPrefixScore(int[] nums) {

        int n = nums.length;
        long max_num = 0;
        long con[] = new long[n];
        long score_arr[] = new long[n];
        long score = 0;
        // int j=0;
        for (int i = 0; i < n; i++) {
            long curr_num = nums[i];
            max_num = Math.max(max_num, curr_num);
            con[i] = curr_num + max_num;
            score += con[i];
            score_arr[i] = score;
        }

        return score_arr;
    }
}
