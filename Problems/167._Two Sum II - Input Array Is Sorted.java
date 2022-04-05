//Runtime: 3 ms, faster than 32.29% of Java online submissions for Two Sum II - Input Array Is Sorted.
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int h = numbers.length-1;
        while(l<h){
            int sum = numbers[l] +numbers[h];
            if(sum == target){
                return new int[]{l+1,h+1};
            }else if (sum> target){
                h--;
            }else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}


//Runtime: 1 ms, faster than 99.06% of Java online submissions for Two Sum II - Input Array Is Sorted.
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) r--;
            else l++;
        }
        return new int[]{l + 1, r + 1};
    }
}