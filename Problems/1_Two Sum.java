//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        Arrays.sort(nums);
        for(i = 1; i< nums.length ;i++){
            if(nums[i-1]+nums[i] == target)
                break;
        }
        System.out.println(i-1);
        int[] nums_return = {i-1,i};
        return nums_return;
    }
}

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}