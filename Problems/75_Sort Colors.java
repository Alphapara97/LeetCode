class Solution {
    public void sortColors(int[] nums) {
        int i,j,temp;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}

class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)indexMap.put()
            else if(nums[i]==1)countwhite++;
            else countblue++;
        }

        for(int j=0;j<nums.length;j++){
            if(countred>0){
                nums[j]=0;
                countred--;
            }
            else if(countwhite>0){
                nums[j]=1;
                countwhite--;
            }
            else{
                nums[j]=2;
            }
        }
    }

}

class Solution {
    public void sortColors(int[] nums) {
        int l=0,i=0,r=nums.length-1;
        while(i<=r){
            if(nums[i]==0)
                swap(nums, l++, i++);
            else if(nums[i]==2)
                swap(nums, i, r--);

            else i++;
        }

    }
    private void swap(int[] nums, int p1, int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}