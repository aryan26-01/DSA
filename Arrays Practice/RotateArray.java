
// Q. https://leetcode.com/problems/rotate-array/

public class RotateArray {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // ArrayList<Integer> temp=new ArrayList<>();
        // for(int i=n-k;i<n;i++){
        // temp.add(nums[i]);
        // }

        // for(int m=n-k-1;m>=0;m--){
        // nums[m+k]=nums[m];
        // }

        // for(int j=0;j<k;j++){
        // nums[j]=temp.get(j);
        // }

        for (int st = 0, en = nums.length - 1; st < en; st++, en--) {
            int temp1 = nums[st];
            nums[st] = nums[en];
            nums[en] = temp1;
        }
        for (int st = 0, en = k - 1; st < en; st++, en--) {
            int temp1 = nums[st];
            nums[st] = nums[en];
            nums[en] = temp1;
        }

        for (int st = k, en = nums.length - 1; st < en; st++, en--) {
            int temp1 = nums[st];
            nums[st] = nums[en];
            nums[en] = temp1;
        }

    }
}
