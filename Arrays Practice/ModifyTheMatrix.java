
// Q. https://leetcode.com/problems/modify-the-matrix/

import java.util.ArrayList;
import java.util.Arrays;

public class ModifyTheMatrix {
    public static int[][] modifiedMatrix(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < cols; i++) {
            int max_num = Integer.MIN_VALUE;

            for (int j = 0; j < rows; j++) {
                int curr_num = matrix[j][i];
                System.out.println("Curr Num is: " + curr_num);
                if (curr_num == -1) {
                    arr.add(j);
                    // System.out.println("Index is : " +index);
                } else {
                    max_num = Math.max(curr_num, max_num);
                }

            }
            System.out.println("Max Number is : " + max_num);

            for (int k = 0; k < arr.size(); k++) {
                int val = arr.get(k);
                matrix[val][i] = max_num;
                System.out.println("Update Matrix is: " + matrix[val][i]);
            }
            arr.clear();
            System.out.println(Arrays.deepToString(matrix));
        }
        return matrix;
    }
}
