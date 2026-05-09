class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            int idx=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    idx=j;
                    break;
                }
            }
            int nxt=-1;
            for(int j=idx+1;j<nums2.length;j++)
            {
                if(nums2[j]>nums2[idx])
                {
                    nxt=nums2[j];
                    break;
                }
            }
            l.add(nxt);
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}