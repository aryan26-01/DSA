
// Q. https://www.geeksforgeeks.org/problems/key-pair5616/1

public class TwoSumPairWithGivenSum {
    // Learnings
    // 1. We solved this using commented Array List code but it exceeded time
    // complexity after some point.
    // 2. So in the optimised solution we took an array and accordingly we kept '1'
    // at indices(current num)
    // in that array.
    // 3. Since array indices cannot be negative, we used a variable offset to shift
    // the indices by a fixed
    // constant so that we get valid index. We have set value in offset value
    // according to the constraints
    // given in question.

    boolean twoSum(int arr[], int target) {
        // code here
        // ArrayList<Integer> arr1= new ArrayList<>();

        // for(int i=0;i<arr.length;i++){
        // int curr_num = arr[i];
        // int to_search=target - curr_num;
        // if(arr1.contains(to_search)){
        // return true;
        // }
        // arr1.add(curr_num);
        // }

        // return false;

        int OFFSET = 100000;
        int MAX = 200001;

        int[] seen = new int[MAX];

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int to_search = target - curr;

            int idx = to_search + OFFSET; // shifted index for lookup
            if (idx >= 0 && idx < MAX && seen[idx] == 1) {
                return true;
            }

            seen[curr + OFFSET] = 1; // mark current number as seen
        }

        return false;
    }
}
