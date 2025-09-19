
// Q. https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

import java.util.ArrayList;

public class MaximumNumberOfVowelsInASubstringofGivenLength {
    public int maxVowels(String s, int k) {
        ArrayList<Character> arr1 = new ArrayList<>();
        int curr_count = 0;
        int max_count = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            arr1.add(s.charAt(i));
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                curr_count++;
            }
        }
        max_count = curr_count;

        for (int st = 1, en = k; en < s.length(); st++, en++) {
            char c_r = s.charAt(st - 1);
            if (c_r == 'a' || c_r == 'e' || c_r == 'i' || c_r == 'o' || c_r == 'u') {
                curr_count--;
            }
            arr1.remove(Character.valueOf(c_r));

            char c_add = s.charAt(en);
            arr1.add(c_add);
            if (c_add == 'a' || c_add == 'e' || c_add == 'i' || c_add == 'o' || c_add == 'u') {
                curr_count++;
                max_count = Math.max(max_count, curr_count);
            }

        }

        return max_count;
    }
}
