
// Q. https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

class MaxSumSubArray {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int curr_sum = 0;
        int max_sum = 0;

        // Sliding Window approach
        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        max_sum = curr_sum;

        for (int st = 1, en = k; en < arr.length; st++, en++) {
            curr_sum -= arr[st - 1];
            curr_sum += arr[en];

            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}
