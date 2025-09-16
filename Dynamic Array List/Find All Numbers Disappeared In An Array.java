import java.util.*;
// Q. https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // Removing duplicates into arr1
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr1.add(nums[i]);
            }
        }

        // 2 Pointers Approach
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (i < arr1.size() && arr1.get(i) == j) {
                i++;
            } else {
                result.add(j);
            }
        }

        return result;
    }
}