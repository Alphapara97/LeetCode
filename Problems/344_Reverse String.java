//Runtime: 1 ms, faster than 81.41% of Java online submissions for Reverse String.
class Solution {
    public void reverseString(char[] s) {
        int l =0;
        int r = s.length -1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

    }
}