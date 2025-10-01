
// Q. https://leetcode.com/problems/shifting-letters-ii/

// 🔹 Approach: Prefix Sum + Difference Array
// 1. Use a difference array (new_arr) to record range shift effects in O(1).
//    - Forward shift (dir=1): new_arr[l] += 1, new_arr[r+1] -= 1
//    - Backward shift (dir=0): new_arr[l] -= 1, new_arr[r+1] += 1
// 2. Build prefix sum → gives net shift for each index.
// 3. Apply shift to each char: (ch - 'a' + shift) % 26 + 'a'
//    - Handles wrap-around in alphabet.
//    - If shift < 0, adjust by adding 26.
// 🔹 Time Complexity: O(n + m)
// 🔹 Space Complexity: O(n)
// ✅ Efficient for large strings and many shift operations.

public class ShiftingLetters2 {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int new_arr[] = new int[n + 1];

        for (int i = 0; i < shifts.length; i++) {
            int st = shifts[i][0];
            int en = shifts[i][1];
            int dir = shifts[i][2];

            if (dir == 1) {
                new_arr[st] += 1;
                if (en + 1 < n)
                    new_arr[en + 1] -= 1;
            } else {
                new_arr[st] -= 1;
                if (en + 1 < n)
                    new_arr[en + 1] += 1;
            }
        }

        // prefix sum
        for (int j = 1; j < n; j++) {
            new_arr[j] += new_arr[j - 1];
        }

        StringBuilder sb = new StringBuilder(s);

        for (int k = 0; k < n; k++) {
            int shift = new_arr[k] % 26;
            if (shift < 0)
                shift += 26;

            char ch = sb.charAt(k);
            char newChar = (char) ((ch - 'a' + shift) % 26 + 'a');
            sb.setCharAt(k, newChar);
        }

        return sb.toString();
    }
}
