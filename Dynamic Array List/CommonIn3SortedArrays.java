
// Q. https://www.geeksforgeeks.org/problems/common-elements1132/1

import java.util.*;

public class CommonIn3SortedArrays {
    public static void main(String[] args) {
        // write your code here
        List<Integer> arr1 = new ArrayList<>(List.of(1, 5, 10, 20, 40, 80));
        List<Integer> arr2 = new ArrayList<>(List.of(6, 7, 20, 80, 100));
        List<Integer> arr3 = new ArrayList<>(List.of(3, 4, 15, 20, 30, 70, 80, 120));

        List<Integer> result = commonElements(arr1, arr2, arr3);
        System.out.println(result);
    }

    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
            List<Integer> arr3) {
        // Code Here
        int i = 0, j = 0, k = 0;
        // List<Integer> arr_initial = new ArrayList<>();
        List<Integer> arr_final = new ArrayList<>();

        while (arr1.size() > i && arr2.size() > j && arr3.size() > k) {
            int curr_arr1 = arr1.get(i);
            int curr_arr2 = arr2.get(j);
            int curr_arr3 = arr3.get(k);

            if (curr_arr1 == curr_arr2 && curr_arr2 == curr_arr3) {

                if (arr_final.isEmpty() || arr_final.get(arr_final.size() - 1) != curr_arr1) {
                    arr_final.add(curr_arr1);
                }
                i++;
                j++;
                k++;
            }

            else if (curr_arr1 < curr_arr2) {
                i++;
            }

            else if (curr_arr2 < curr_arr3) {
                j++;
            }

            else {
                k++;
            }
        }

        if (arr_final.isEmpty()) {
            return Arrays.asList(-1);
        }
        return arr_final;
    }
}
