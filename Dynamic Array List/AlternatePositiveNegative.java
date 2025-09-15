
// Q. https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

import java.util.ArrayList;

public class AlternatePositiveNegative {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> arr_new = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int length = arr.size();

        for (int i = 0; i < length; i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            }

            else {
                neg.add(arr.get(i));
            }
        }

        int k = 0;
        int m = 0;

        for (int j = 0; j < length; j++) {

            if (j % 2 == 0 && k < pos.size()) {
                arr_new.add(pos.get(k));
                k++;
            }

            if (j % 2 != 0 && m < neg.size()) {
                arr_new.add(neg.get(m));
                m++;
            }
        }

        // Adding Remaining elements
        while (k < pos.size()) {
            arr_new.add(pos.get(k++));
        }

        while (m < neg.size()) {
            arr_new.add(neg.get(m++));
        }

        arr.clear();
        arr.addAll(arr_new);

    }
}
