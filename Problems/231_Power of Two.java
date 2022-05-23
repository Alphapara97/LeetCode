class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 1;
        while(i<n){
            i *= 2;
        }
        return i == n;
    }
} // Time Limit Exceeded

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
}
//Runtime: 2 ms, faster than 52.40% of Java online submissions for Power of Two.
//Memory Usage: 40.6 MB, less than 72.35% of Java online submissions for Power of Two.

