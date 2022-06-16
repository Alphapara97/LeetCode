class Solution {
    public int climbStairs(int n) {
        int step1 = 1;
        int step2 = 1;
        int temp;
        for (int i = 0;i<n-1;i++){
            temp = step1;
            step1 = step1 +step2;
            step2 = temp;
        }
        return step1;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
//        Memory Usage: 38.8 MB, less than 94.21% of Java online submissions for Climbing Stairs.

//https://www.youtube.com/watch?v=Y0lT9Fck7qI
//fibonacci logic reverse DP
class Solution {
    public int climbStairs(int n) {
        intp[] dp = new int[n+1];
        int dp[0] = 1;
        int dp[1] = 1;
        for (int i = 2;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
        }
        return dp[n];
    }
}
