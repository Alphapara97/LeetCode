public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            res += n%2;
            n = n>>1;
        }
        return res;
    }
}
// time limit exceeded


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            n &= n-1;
            res += 1;
        }
        return res;
    }
}

// Runtime: 2 ms, faster than 18.10% of Java online submissions for Number of 1 Bits.

