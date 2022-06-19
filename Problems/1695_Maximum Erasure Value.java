class Solution {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, curr= 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (set.contains(nums[j])) {
                while (nums[i] != nums[j]) {
                    curr -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                if (nums[i] == nums[j]) {
                    curr -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
            }
            curr += nums[j];
            set.add(nums[j]);
            max = Math.max(curr, max);
        }
        return max;
    }
}


class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxScore = 0, currScore = 0;
        Set<Integer> set = new HashSet<>();

        for (int l=0, r=0; r<nums.length; r++) {
            while (!set.add(nums[r])) {
                currScore -= nums[l];
                set.remove(nums[l++]);
            }
            currScore += nums[r];
            maxScore = Math.max(maxScore, currScore);
        }

        return maxScore;
    }
}