class Solution {
    public int firstMissingPositive(int[] nums) {
        long max=1;
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        int res=0;
        for(int i=1; i<=nums.length+1;i++){
            if(!map.contains(i)){
                res=i;
                break;
            }
        }
        return res;
    }
}

//Runtime: 33 ms, faster than 21.15% of Java online submissions for First Missing Positive.

class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing = 1;
        while (true) {
            boolean found = false;
            int i =0;
            while (i <nums.length) {
                if (missing ==nums[i]) {
                    missing++;
                    found = true;
                }
                i++;
            }
            if (i==nums.length && !found) {
                return missing;
            }
        }
    }
}