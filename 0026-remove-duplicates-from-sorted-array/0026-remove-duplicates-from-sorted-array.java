class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0,p2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[p1]!=nums[p2]){
                p1++;
                nums[p1]=nums[p2];
            }
            p2++;
        }
        return p1+1;
    }
}