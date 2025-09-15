
// Q. https://leetcode.com/problems/missing-number/

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing_number = -1;
        boolean ans = false;
        for (int i = 0; i <= n; i++) {

            for (int num : nums) {
                if (num == i) {
                    ans = true;
                    break;
                }
            }

            if (!ans) {
                missing_number = i;
            }
        }

        return missing_number;
    }

    public static void main(String[] args) {

    }

}
