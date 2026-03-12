class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int m=0;m<nums.length;m++)
        {
            for(int n=m+1;n<nums.length;n++)
            if (nums[m]+nums[n]==target)
              return new int[]{m,n} ;
              
        }
        return new int[]{} ;
    }
}