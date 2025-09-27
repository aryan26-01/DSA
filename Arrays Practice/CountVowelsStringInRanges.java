
// Q. https://leetcode.com/problems/count-vowel-strings-in-ranges/

public class CountVowelsStringInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int vowels[] = new int[words.length];
        int final_ans[] = new int[queries.length];
        // for(int i=0;i<words.length;i++){
        // String curr= words[i];
        // char first=curr.charAt(0);
        // char last=curr.charAt(curr.length() - 1);

        // if(isVowel(first) && isVowel(last)){
        // arr.add(curr);
        // }
        // }

        // for(int j=0;j<queries.length;j++){
        // int num1=queries[j][0];
        // int num2=queries[j][1];
        // int ans=0;
        // for(int k=num1;k<=num2;k++){
        // if(arr.contains(words[k])){
        // ans+=1;
        // }
        // }
        // final_ans[j]=ans;
        // }

        // The above approach is fine but it exceeds time complexity.
        // The below is an optimised approach using Prefix sum method.
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            char first = curr.charAt(0);
            char last = curr.charAt(curr.length() - 1);

            if (isVowel(first) && isVowel(last)) {
                vowels[i] = 1;
            } else {
                vowels[i] = 0;
            }
        }

        int prefix[] = new int[words.length];
        prefix[0] = vowels[0];
        for (int j = 1; j < words.length; j++) {
            prefix[j] = vowels[j] + prefix[j - 1];
        }

        for (int k = 0; k < queries.length; k++) {
            int l = queries[k][0];
            int r = queries[k][1];

            if (l == 0) {
                final_ans[k] = prefix[r];
            }

            else {
                final_ans[k] = prefix[r] - prefix[l - 1];
            }
        }
        return final_ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
