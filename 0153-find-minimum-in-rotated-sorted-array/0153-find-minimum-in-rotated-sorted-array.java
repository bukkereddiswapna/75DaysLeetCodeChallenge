class Solution {
    public int findMin(int[] nums) {
        int h=nums.length-1;
        int l=0;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h])
            {
                l=mid+1;
            }else{
                h=mid;
            }
        }
        return nums[l];
    }
}