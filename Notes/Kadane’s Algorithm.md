**Definition:**

A method to find the maximum sum of a contiguous subarray in an array of numbers.

**How it works (simple words):**

1. Move through the array from left to right.

2. At each element, decide:

   a. Start new subarray from this element? OR

   b. Continue previous subarray sum?

3. Keep track of the maximum sum found so far.

**Example Problem:**

**Find maximum sum of contiguous subarray.**

**Example Code (Java):**
class KadaneExample {
static int maxSubArray(int[] nums) {
int maxEndingHere = nums[0];
int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Output: 6
    }

}

**Explanation with Input [-2,1,-3,4,-1,2,1,-5,4]:**

**Step 1:** maxEndingHere = -2, maxSoFar = -2

**Step 2:** maxEndingHere = 1, maxSoFar = 1

**Step 3:** maxEndingHere = -2, maxSoFar = 1

**Step 4:** maxEndingHere = 4, maxSoFar = 4

**Step 5:** maxEndingHere = 3, maxSoFar = 4

**Step 6:** maxEndingHere = 5, maxSoFar = 5

**Step 7:** maxEndingHere = 6, maxSoFar = 6

**Step 8:** maxEndingHere = 1, maxSoFar = 6

**Step 9:** maxEndingHere = 5, maxSoFar = 6 → Answer = 6
