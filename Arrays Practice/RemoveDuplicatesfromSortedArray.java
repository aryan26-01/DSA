
// Q. https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=two-pointers

import java.util.*;

class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>(); // [1 1 2]
        int i = 1;
        int prev_num = nums[0];
        arr.add(prev_num);
        while (i < nums.length) {
            if (nums[i] != prev_num) {
                arr.add(nums[i]);
                prev_num = nums[i];
            }
            i++;
        }

        for (int j = arr.size() - 1; j >= 0; j--) {
            nums[j] = arr.get(j);
        }

        return arr.size();

    }
}