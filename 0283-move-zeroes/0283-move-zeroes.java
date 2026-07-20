class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,i=0;
        if(nums.length==1) return;
        while(j<nums.length){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;
        }
    }
}