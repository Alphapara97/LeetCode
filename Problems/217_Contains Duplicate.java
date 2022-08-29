class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])) return true;
            else{
                check.put(nums[i],i);
            }
        }
        return false;
    }
}



class Solution{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> check = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(check.contains(nums[i])) return true;
            else
            {
                check.add(nums[i]);
            }
        }
        return false;
    }
}