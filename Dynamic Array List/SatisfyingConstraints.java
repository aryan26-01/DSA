import java.util.*;

public class SatisfyingConstraints {
    public static void main(String[] args) {
        // For Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // No. of Constraints
            int t = sc.nextInt();
            int st = Integer.MAX_VALUE;
            int en = Integer.MAX_VALUE;
            int curr_x = 0;
            int max_a = 0;
            int min_a = Integer.MAX_VALUE;
            int count2 = 0;
            int ans = Integer.MAX_VALUE;
            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < t; j++) {
                int a = sc.nextInt();
                int x = sc.nextInt();
                curr_x = x;
                // for a==1
                if (a == 1) {
                    max_a = Math.max(max_a, curr_x);
                    st = max_a;
                }
                // for a==2
                else if (a == 2) {
                    min_a = Math.min(min_a, curr_x);
                    en = min_a;
                }
                // for a==3
                else {
                    arr.add(curr_x);
                }
            }

            // System.out.println("Start : " +st);
            // System.out.println("End : " +en);
            int count1 = en - st + 1;
            for (int x : arr) {
                if (x >= st && x <= en) {
                    count2++;
                }
            }
            // System.out.println("Count 1: "+ count1);
            // System.out.println("Count 2: "+ count2);
            // System.out.println("Count 3: "+ count3);
            ans = count1 - (count2);

            if (ans < 0) {
                ans = 0;
            }
            System.out.println(ans);
        }

    }
}