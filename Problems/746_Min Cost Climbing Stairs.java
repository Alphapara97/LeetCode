class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length +1];
        arr[0] = 0;
        arr[1] = 0;
        int i ;
        for(i=2;i<=cost.length;i++){
            arr[i] = Math.min(arr[i-1]+cost[i-1],arr[i-2]+cost[i-2]);
        }
        return arr[cost.length];
    }
}