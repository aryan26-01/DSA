
// GFG - Finding Maximum Sum SubArray question but it wont work according to the contraints on GFG.
// I have attached an optimised solution of the problem it in another file named "MaxSumSubArray.java".

public class MaximumSumSubArray {
    public static void main(String[] args) {
        // write your code here
        int arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int result = maxSubarraySum(arr, 4);
        System.out.println(result);
    }

    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int curr_sum = 0;
        int max_sum = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            curr_sum = 0;
            int val = 1;
            int j = i;

            while (val <= k) {
                System.out.println("i at: " + i + " and value is " + arr[i]);
                System.out.println("val is: " + val);

                curr_sum += arr[j];
                System.out.println("Current sum is: " + curr_sum);

                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                    System.out.println("Max sum is: " + max_sum);
                }
                j++;
                val++;
            }
        }
        return max_sum;
    }
}
