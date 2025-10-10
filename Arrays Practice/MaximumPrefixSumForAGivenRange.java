
// Q. https://www.geeksforgeeks.org/problems/maximum-prefix-sum-for-a-given-range0227/1

import java.util.*;

public class MaximumPrefixSumForAGivenRange {
    public List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
            List<Integer> rightIndex) {
        int n = arr.size();
        int[] pref = new int[n];
        pref[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr.get(i);
        }

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < leftIndex.size(); j++) {
            int left = leftIndex.get(j);
            int right = rightIndex.get(j);

            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for (int i = left; i <= right; i++) {

                if (left == 0) {
                    currSum = pref[i];
                }

                else {
                    currSum = pref[i] - pref[left - 1];
                }

                maxSum = Math.max(maxSum, currSum);
            }

            res.add(maxSum);
        }

        return res;
    }
}
