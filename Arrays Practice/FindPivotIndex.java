
// Q. https://leetcode.com/problems/find-pivot-index/

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        int suff[] = new int[n];
        for (int k = 0; k < n; k++) {
            if (k == 0) {
                pref[k] = nums[k];
            } else {
                pref[k] = pref[k - 1] + nums[k];
            }
        }

        for (int j = n - 1; j >= 0; j--) {
            if (j == n - 1) {
                suff[j] = nums[j];
            } else {
                suff[j] = nums[j] + suff[j + 1];
            }
        }

        // System.out.println(Arrays.toString(pref));
        // System.out.println(Arrays.toString(suff));
        // [1, 8, 11, 17, 22, 28]
        // [28, 27, 20, 17, 11, 6]
        int pivot = -1;
        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0 ? 0 : pref[i - 1]);
            int rightSum = (i == n - 1 ? 0 : suff[i + 1]);
            if (leftSum == rightSum) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}
