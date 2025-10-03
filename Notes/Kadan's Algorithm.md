**Definition**
Kadane's Algorithm is a powerful technique used to find the maximum sum of a contiguous subarray in an array. It works in O(n) time complexity, making it much more efficient than brute-force approaches.

**💡 Problem Statement**
You are given an array of integers (which may contain positive and negative numbers). Find the contiguous subarray that has the largest sum.

**🔹 Example:**

**📝 Input:** nums = [-2,1,-3,4,-1,2,1,-5,4] ✅

**Output:** 6 💡

**Explanation:** The subarray [4,-1,2,1] has the maximum sum = 6.

**❌ Brute Force Approach (O(n²) Time Complexity)**
A naïve approach is to check all possible subarrays and compute their sums. This approach is slow since it uses nested loops.

**🖥️ Java Code (Brute Force)**

public class MaxSubarrayBruteForce {
public static int maxSubArray(int[] nums) {
int maxSum = Integer.MIN_VALUE;
for (int i = 0; i < nums.length; i++) {
int currentSum = 0;
for (int j = i; j < nums.length; j++) {
currentSum += nums[j];
maxSum = Math.max(maxSum, currentSum);
}
}
return maxSum;
}

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }

}

**⏳ Time Complexity:** O(n²) 💾 **Space Complexity:** O(1)

**⚡ Kadane's Algorithm: Optimized Approach (O(n) Time Complexity)**
Instead of checking all subarrays, Kadane’s Algorithm tracks the maximum sum dynamically in a single loop.

**🔥 Algorithm Steps:**

1️⃣ Initialize:
maxSum = Integer.MIN_VALUE (to store the maximum sum found so far).
currentSum = 0 (to store the running sum).

2️⃣ Loop through the array:
Add the current element to currentSum.
Update maxSum if currentSum is greater.
If currentSum is negative, reset it to 0 (start a new subarray).

3️⃣ Return maxSum after the loop finishes.

**🖥️ Kadane’s Algorithm Code (Java)**
public class KadaneAlgorithm {
public static int maxSubArray(int[] nums) {
int maxSum = Integer.MIN_VALUE;
int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }

}

⏳ **Time Complexity:** O(n) ✅ (Much faster!) 💾 **Space Complexity:** O(1) ✅

**🔥 Bonus: Find the Actual Subarray**
Kadane’s Algorithm can also return the subarray itself (not just the sum).

**🖥️ Java Code to Get Subarray**
public class KadaneWithSubarray {
public static int[] maxSubArray(int[] nums) {
int maxSum = Integer.MIN_VALUE, currentSum = 0;
int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        return new int[]{maxSum, start, end};
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result[0]);
        System.out.println("Subarray Indices: [" + result[1] + ", " + result[2] + "]");
    }

}

**❓ Frequently Asked Questions**

**🔹 1. Why do we reset currentSum to 0 when it's negative?**
👉 If currentSum becomes negative, it means adding it to future elements will only reduce their sum. Resetting it to 0 helps start fresh.

**🔹 2. What if all numbers in the array are negative?**
👉 The algorithm will return the largest negative number, since resetting to 0 is only done when currentSum < 0.

**🔹 3. Can we modify Kadane’s Algorithm to work for 2D arrays?**
👉 Yes! Kadane’s Algorithm can be extended to work for 2D matrices to find the maximum sum sub-matrix using a combination of row-wise Kadane’s and prefix sums.
