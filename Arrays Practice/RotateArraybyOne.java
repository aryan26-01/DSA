
// Q. https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

public class RotateArraybyOne {
    public void rotate(int[] arr) {

        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}
