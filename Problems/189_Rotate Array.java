class Solution {
    // bad solution
    public void rotate(int[] nums, int k) {
        k = k% nums.length;
        int l = 0, r = nums.length-1;
        while(l<r){
            int temp;
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l = l+1;
            r = r-1;
        }
        int l1 = 0, r1 = k-1;
        while(l1<r1){
            int temp;
            temp = nums[l1];
            nums[l1] = nums[r1];
            nums[r1] = temp;
            l1 = l1+1;
            r1 = r1-1;
        }
        int l2 = k, r2 = nums.length-1;
        while(l2<r2){
            int temp;
            temp = nums[l2];
            nums[l2] = nums[r2];
            nums[r2] = temp;
            l2 = l2+1;
            r2 = r2-1;

        }

    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}