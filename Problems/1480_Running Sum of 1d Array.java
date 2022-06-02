class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        for(i = 1; i<nums.length ; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
//Memory Usage: 42 MB, less than 96.72% of Java online submissions for Running Sum of 1d Array.