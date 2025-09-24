🔹 1️⃣ **Sliding Window Algorithm**

**Definition:**

A technique where we maintain a window (part of the array or string) and move it across while keeping a condition true.

a. The window expands or shrinks depending on the situation.

**How it works (simple words):**

1. Start with two pointers: left and right.

2. Move right to expand the window.

3. If the condition breaks (e.g., duplicate character), move left to shrink the window.

4. Track the best answer (like max length).

**Example Problem:**

**Find the length of the longest substring without repeating characters.**

**Example Code (Java):**
import java.util.\*;

class SlidingWindowExample {
static int longestUniqueSubstring(String s) {
ArrayList<Character> window = new ArrayList<>();
int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            // Shrink window if duplicate found
            while (window.contains(c)) {
                window.remove(0);  // remove leftmost character
            }

            window.add(c);          // expand window
            maxLen = Math.max(maxLen, window.size());
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUniqueSubstring(s)); // Output: 3
    }

}

**Explanation with Input "abcabcbb":**

**Step 1:** Window = [a] → maxLen = 1

**Step 2:** Window = [a, b] → maxLen = 2

**Step 3:** Window = [a, b, c] → maxLen = 3

**Step 4:** Duplicate 'a' appears → remove from left → Window = [b, c, a] → maxLen = 3

Continue until end → Answer = 3 ("abc")
