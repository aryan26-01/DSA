
// Q. https://www.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1

import java.util.ArrayList;

public class LengthOfTheLongestSubstring {
    int longestUniqueSubstring(String s) {
        // code here

        ArrayList<Character> arr = new ArrayList<>();
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {

            char curr_ch = s.charAt(r);

            // If duplicate exists, shrink from left until it's removed
            while (arr.contains(curr_ch)) {
                arr.remove(0); // remove from front (left side of window)
            }

            arr.add(curr_ch);
            ans = Math.max(ans, arr.size());

        }

        return ans;
    }
}
