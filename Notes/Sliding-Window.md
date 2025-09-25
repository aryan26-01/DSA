**Understanding the Sliding Window Algorithm (With Examples)**

**Introduction**
The Sliding Window Algorithm is an optimization technique used in programming to reduce time complexity when dealing with problems related to arrays or strings. Instead of recalculating values repeatedly, this technique maintains a "window" of elements and slides it across the data structure efficiently.

**Why Use Sliding Window?**
Many problems require us to compute something over a subarray or substring, such as:
a. Finding the maximum sum of k consecutive elements.
b. Finding the longest substring with unique characters.
c. Checking if an array contains a specific pattern.

Using a brute-force approach (nested loops) can be inefficient, with a time complexity of O(n²). The Sliding Window technique reduces this to O(n), making the solution much faster.

**Types of Sliding Window Approaches**

1. **Fixed-size Sliding Window** – The window size remains constant.
2. **Variable-size Sliding Window** – The window size changes dynamically based on conditions.

**Example 1:** Fixed-size Sliding Window
**Problem Statement:** Find the maximum sum of any k consecutive elements in an array.
**Brute Force Approach (O(n²))**
A simple approach would be to compute the sum of every possible subarray of size k.
int maxSum(int arr[], int n, int k) {
int maxSum = 0;

    for (int i = 0; i <= n - k; i++) {
        int sum = 0;
        for (int j = i; j < i + k; j++) {
            sum += arr[j];
        }
        maxSum = max(maxSum, sum);
    }

    return maxSum;

}

However, this solution is inefficient because it recomputes the sum for each subarray.

**Optimized Sliding Window Approach (O(n))**
Instead of recalculating the sum each time, we: 1. Compute the sum of the first k elements. 2. Slide the window forward by removing the first element and adding the next element.
int maxSum(int arr[], int n, int k) {
int windowSum = 0;

    // Compute sum of first window
    for (int i = 0; i < k; i++)
        windowSum += arr[i];

    int maxSum = windowSum;

    // Slide the window
    for (int i = k; i < n; i++) {
        windowSum += arr[i] - arr[i - k]; // Remove the first element and add the next one
        maxSum = max(maxSum, windowSum);
    }

    return maxSum;

}

**Explanation**

1. The first k elements are summed in O(k).
2. Then, for each new element, we subtract the first element of the old window and add the new element, 3.keeping operations constant (O(1)).
3. The overall time complexity is O(n), making it much more efficient.

**Example 2:** Variable-size Sliding Window
**Problem Statement:** Find the length of the longest substring with at most 2 distinct characters.
**Approach:**

1.  Use two pointers (left and right) to represent the sliding window.
2.  Expand the window (right++) until there are more than 2 distinct characters.
3.  If more than 2 distinct characters exist, shrink the window (left++).
    int lengthOfLongestSubstring(string s) {
    unordered_map<char, int> freq;
    int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s[right]]++;  // Add new character to map

            while (freq.size() > 2) {  // If more than 2 distinct chars, shrink window
                freq[s[left]]--;
                if (freq[s[left]] == 0)
                    freq.erase(s[left]);
                left++;
            }

            maxLength = max(maxLength, right - left + 1);
        }

        return maxLength;

    }

**Explanation:**

1. Expand the window by adding characters (right++).
2. If more than 2 distinct characters are found, shrink the window (left++).
3. The answer is the largest window size found.

**Conclusion:**
The Sliding Window Algorithm is a powerful optimization technique for problems involving contiguous subarrays or substrings. It significantly improves efficiency by avoiding unnecessary recalculations.

**When to use Sliding Window?**
✅ Problems involving contiguous subarrays or substrings.
✅ When recalculating values overlapping in consecutive elements.
✅ When a brute-force O(n²) solution can be optimized to O(n).

**Common Problems to Practice**
Maximum sum of k consecutive elements (Fixed window).
Longest substring with unique characters (Variable window).
Smallest subarray with sum ≥ S (Variable window).
Permutation in a string (Fixed window).
