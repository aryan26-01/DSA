**Prefix Sum Approach – Notes**

**Definition:**
The prefix sum of an array is a new array where each element at index i stores the sum of all elements from the start up to i.

**Formally:**
prefix[i] = arr[0] + arr[1] + ... + arr[i]

**Why Use Prefix Sum?**
👉 It allows you to answer range sum queries in O(1) time, after an O(n) preprocessing step.

**For a query (l, r):**
sum(l, r) = prefix[r] - prefix[l - 1] if l > 0
sum(l, r) = prefix[r] if l == 0

**Step by Step Example**
**Suppose:**
arr = [2, -1, 3, 5]

**Build prefix sum:**
prefix[0] = arr[0] = 2
prefix[1] = prefix[0] + arr[1] = 2 + (-1) = 1
prefix[2] = prefix[1] + arr[2] = 1 + 3 = 4
prefix[3] = prefix[2] + arr[3] = 4 + 5 = 9

**So:**
prefix = [2, 1, 4, 9]

Query (1,3) → sum of arr[1..3]:
prefix[3] - prefix[0] = 9 - 2 = 7
(Which is -1 + 3 + 5 = 7) ✅

Query (0,2) → sum of arr[0..2]:
prefix[2] = 4
(Which is 2 + (-1) + 3 = 4) ✅

**Code (Java)**
class PrefixSumExample {
public static void main(String[] args) {
int[] arr = {2, -1, 3, 5};
int n = arr.length;

        // Step 1: Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Query examples
        System.out.println("Sum from 1 to 3: " + (prefix[3] - prefix[0])); // 7
        System.out.println("Sum from 0 to 2: " + prefix[2]);              // 4
    }

}

**Time Complexity**
Preprocessing prefix array: O(n)
Each query: O(1)
Total for q queries: O(n + q)

**Prefix sums are widely used in:**
Range sum queries (like sumRange problem).
Difference arrays (range update problems).
2D prefix sums (for submatrices).
